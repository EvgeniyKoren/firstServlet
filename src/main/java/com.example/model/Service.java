package com.example.model;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.*;

public class Service {

    private static final String URL = "jdbc:mysql://localhost:3306/mydb_test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    public Connection connection;

    public Connection getConnection() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
