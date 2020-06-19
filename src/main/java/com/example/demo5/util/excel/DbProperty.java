package com.example.demo5.util.excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbProperty {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&serverTimezone=GMT%2B8";
            String username = "root";
            String password = "root";
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
