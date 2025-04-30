package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/pp_db1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "34547809A";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            connection.setAutoCommit(false);
            System.out.println("Connection successful");
        } catch (SQLException | ClassNotFoundException e) {
             throw new RuntimeException("Connection failed");
        }
        return connection;
    }
}
