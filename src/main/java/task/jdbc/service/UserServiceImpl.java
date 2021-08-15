package task.jdbc.service;

import task.jdbc.dao.UserDao;
import task.jdbc.dao.UserDaoJDBCImpl;
import task.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao users = new UserDaoJDBCImpl();
    public void createUsersTable() {
        users.createUsersTable();
    }
    public void dropUsersTable() {
        users.dropUsersTable();
    }
    public void saveUser(String name, String lastName, byte age) {
        users.saveUser(name, lastName, age);
    }
    public void removeUserById(long id) {
        users.removeUserById(id);
    }
    public List<User> getAllUsers() throws SQLException {
        return users.getAllUsers();
    }
    public void cleanUsersTable() {
        users.cleanUsersTable();
    }
}
