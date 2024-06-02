package com.uno.www.stockmanagement.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectToPostgreSQL implements IConnection {
    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    public void closeConnection() throws SQLException{

    }
}
