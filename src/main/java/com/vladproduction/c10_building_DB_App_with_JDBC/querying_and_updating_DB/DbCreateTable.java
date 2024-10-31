package com.vladproduction.c10_building_DB_App_with_JDBC.querying_and_updating_DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * create table programmatically;
 * table name is: familyGroup
 * */
public class DbCreateTable {
    public static void main(String[] args) {
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()){
            // use CREATE TABLE SQL statement to create table familyGroup
            int result = statement.executeUpdate("CREATE TABLE familyGroup (id int not null auto_increment, nickName varchar(30) not null, primary key(id));");
            System.out.println("Table created successfully");

        }
        catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
