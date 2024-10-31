package com.vladproduction.c10_building_DB_App_with_JDBC.querying_and_updating_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * (continue problematic from DbUpdate) --> with solution
 * to illustrate how we can update a database*/
public class DbUpdate2 {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DbConnector.connectToDb();
             // create a statement from which the created ResultSets
             // are "scroll sensitive" as well as "updatable"
             Statement statement =
                     connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                             ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM contact WHERE firstName=\"Michael\"")) {
            // first fetch the data and display it before the update operation
            System.out.println("Before the update phoneNum");
            System.out.println("id \tfName \tlName \temail \t\tphoneNum");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t"
                        + resultSet.getString("firstName") + "\t"
                        + resultSet.getString("lastName") + "\t"
                        + resultSet.getString("email") + "\t"
                        + resultSet.getString("phoneNum"));
            }
            // now update the resultSet and display the modified data
            resultSet.absolute(1);
            resultSet.updateString("phoneNum", "+919976540000");
            // reflect those changes back to the database by calling updateRow() method
            resultSet.updateRow();
            System.out.println("After the update phoneNum");
            System.out.println("id \tfName \tlName \temail \t\tphoneNum");
            resultSet.beforeFirst();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t"
                        + resultSet.getString("firstName") + "\t"
                        + resultSet.getString("lastName") + "\t"
                        + resultSet.getString("email") + "\t"
                        + resultSet.getString("phoneNum"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
    //output:
    /*Before the update phoneNum
    id 	fName 	lName 	email 		phoneNum
    1	Michael	Taylor	michael@abc.com	+919876543210
    After the update phoneNum
    id 	fName 	lName 	email 		phoneNum
    1	Michael	Taylor	michael@abc.com	+919976540000*/
}
