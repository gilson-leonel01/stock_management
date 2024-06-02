package com.uno.www.stockmanagement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToMySQL implements IConnection {
    private final String USER = "root";
    private final String PASSWORD = "admin";
    private final String URL = "jdbc:mysql://localhost:3306/gestao_venda";
    private Connection connect;

    @Override
    public Connection getConnection() throws SQLException {
        try {
            if(connect == null || connect.isClosed()){
                connect = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connection to database server successful");
            } else {
                System.out.println("Connection already established.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database server.");
            e.printStackTrace();
        }
        return connect;
    }

    public void closeConnection() throws SQLException{
        if(connect != null) connect.close();
    }
}



