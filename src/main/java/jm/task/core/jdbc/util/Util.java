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
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return connection;
    }
}
