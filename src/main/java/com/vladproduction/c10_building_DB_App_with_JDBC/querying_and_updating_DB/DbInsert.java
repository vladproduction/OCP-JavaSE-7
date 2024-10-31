package com.vladproduction.c10_building_DB_App_with_JDBC.querying_and_updating_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * // To illustrate how to insert a row in a ResultSet and in the database
 * */
public class DbInsert {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement(
                     ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")) {
            System.out.println("Before the insert");
            System.out.println("id \tfName \tlName \temail \t\tphoneNum");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + "\t"
                        + resultSet.getString("firstName") + "\t"
                        + resultSet.getString("lastName") + "\t"
                        + resultSet.getString("email") + "\t"
                        + resultSet.getString("phoneNum"));
            }
            resultSet.moveToInsertRow();
            resultSet.updateString("firstName", "John");
            resultSet.updateString("lastName", "K.");
            resultSet.updateString("email", "john@abc.com");
            resultSet.updateString("phoneNum", "+19753186420");
            resultSet.insertRow();
            System.out.println("After the insert");
            System.out.println("id \tfName \tlName \temail \t\tphoneNum");
            resultSet.beforeFirst();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + "\t"
                        + resultSet.getString("firstName") + "\t"
                        + resultSet.getString("lastName") + "\t"
                        + resultSet.getString("email") + "\t"
                        + resultSet.getString("phoneNum"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //output:
    /*Before the insert
    id 	fName 	lName 	email 		phoneNum
    1	Michael	Taylor	michael@abc.com	+919976540000
    2	William	Becker	william@abc.com	+449876543210
    After the insert
    id 	fName 	lName 	email 		phoneNum
    1	Michael	Taylor	michael@abc.com	+919976540000
    2	William	Becker	william@abc.com	+449876543210
    3	John	K.	john@abc.com	+19753186420*/

    /*After printing the current records, you call the moveToInsertRow() method.
    This method sets the cursor to a new record and prepares the ResultSet for the insertion of a row (creates a buffer
    to hold the column values).*/
}
