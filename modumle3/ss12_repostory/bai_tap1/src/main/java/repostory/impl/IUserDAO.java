package repostory.impl;
import model.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    List<User> searchByCountry(String searchValue);

    List<User> sortUserByName();
    void procedureUpdate(int id, User user);

    void procedureDelete(int id);

    String callTransaction();
}


