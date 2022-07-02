package service;

import model.Users;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    public void insertUser(Users user) throws SQLException;

    public Users selectUser(int id);

    public List<Users> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(Users user) throws SQLException;

    Users getUserById(int id);

    void insertUserStore(Users user) throws SQLException;

}
