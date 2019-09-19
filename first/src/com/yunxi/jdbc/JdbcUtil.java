package com.yunxi.jdbc;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
    private static String url = null;
    private static String user = null;
    private static String password = null;
    private static String driverClass = null;
//    private static String url = "jdbc:mysql://localhost:3306/sqlstudy2?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true&failOverReadOnly=false";
//    private static String user = "root";
//    private static String password = "hcj934818";

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("./src/db.properties"));
            driverClass = properties.getProperty("driver");
            Class.forName(driverClass);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(Connection connection) {
        close(connection, null, null);
    }

    public static void close(Connection connection, Statement statement) {
        close(connection, statement, null);
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Connection connection, PreparedStatement PreparedStatement, ResultSet resultSet) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (PreparedStatement != null) {
            try {
                PreparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
