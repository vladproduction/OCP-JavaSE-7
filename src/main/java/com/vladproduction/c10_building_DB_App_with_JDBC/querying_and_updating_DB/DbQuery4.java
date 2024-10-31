package com.vladproduction.c10_building_DB_App_with_JDBC.querying_and_updating_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * u just want to print the name and e-mail address where the
 * first name matches to “Michael.”
 * */
public class DbQuery4 {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery("SELECT firstName, email FROM contact WHERE firstName=\"Michael\"")) {
            System.out.println("fName \temail");
            while (resultset.next()){
                System.out.println(resultset.getString("firstName") + "\t"
                        + resultset.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
