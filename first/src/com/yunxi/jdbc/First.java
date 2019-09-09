package com.yunxi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class First {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // url
        String url="jdbc:mysql://localhost:3306/hh?useSSL=true&useUnicode=true&characterEncoding=gbk&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC";
        // 用户名密码
        String user="root";
        String password="hcj934818";
        // 借助DriverManager驱动管理类对象，获取数据库连接对象Connection
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
        connection.close();
    }
}
