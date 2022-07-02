package service.Impl;


import model.Users;
import repository.IUserRepository;
import repository.impl.UserRepository;
import service.IUserService;
import java.util.List;
public class UserService implements IUserService {
   private IUserRepository iUserRepository = new UserRepository();

    @Override
    public List<Users> getAllUsers() {
        return iUserRepository.getAllUsers();
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
