package task.jdbc;

import task.jdbc.service.UserService;
import task.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Zhalaldin","Toichubaev", (byte) 19);
        userService.saveUser("Maria","Dejavie", (byte) 20);
        userService.saveUser("Anna","Kravchenko", (byte) 21);
        userService.saveUser("Max","Minc", (byte) 22);

        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
