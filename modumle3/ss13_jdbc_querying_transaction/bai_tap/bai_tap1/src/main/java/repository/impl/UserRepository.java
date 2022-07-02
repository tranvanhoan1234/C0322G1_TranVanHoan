package repository.impl;
import model.Users;
import repository.IUserRepository;
import repository.baseUser.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private static final String SELECT_ALL_USERS = "select * from users";
Database database =new Database();
    @Override
    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<>();
        Connection connection = database.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String country = rs.getString("country");
                users.add(new Users(id, name, country));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }
    @Override
    public void saveUsers(Users user) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void editUser(int id, String name, String country) {

    }
    @Override
    public List<Users> searchByCountry(String searchValue) {
        return null;
    }
}
