package com.vladproduction.c10_building_DB_App_with_JDBC.querying_and_updating_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * // Utility class with method connectToDb() that will be used by other programs
 * */
public class DbConnector {
    public static Connection connectToDb() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String database = "abook";
        String userName = "root";
        String password = "11111111";
        return DriverManager.getConnection(url + database, userName, password);
    }
}
