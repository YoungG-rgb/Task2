package task.jdbc.util;

import java.sql.*;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/news";
    private static final String userName = "root";
    private static final String password = "1234";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            System.out.println("Connection is null");
        }
        return connection;
    }
}
