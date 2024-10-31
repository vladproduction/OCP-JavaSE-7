package com.vladproduction.c10_building_DB_App_with_JDBC.performing_transactions;

import com.vladproduction.c10_building_DB_App_with_JDBC.querying_and_updating_DB.DbConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * // To illustrate how to do commit or rollback
 * */
public class DbTransaction {
    /*Let’s imagine now that you want to add a new record in the familyGroup table (you are storing only nicknames of the
    family members) along with full contact details in the table contact. Imagine a situation where you add the nickname
    of a family member in familyGroup but could not add the full contact details of your contact! The situation would lead
    to an inconsistent database. This is an example of a transaction since you want to execute both operations successfully
    (or don’t want to make changes at all, so that you can make an attempt again*/

    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnector.connectToDb();
        ResultSet resultSet1 = null, resultSet2 = null;
        // we're using explicit finally blocks
        // instead of try-with-resources statement in this code
        try {
            // for commit/rollback we first need to set auto-commit to false
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement
                    (ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet1 = statement.executeQuery("SELECT * FROM familyGroup");
            resultSet1.moveToInsertRow();
            resultSet1.updateString("nickName", "Sam.L Uncle");
            // updating here... but this change will be lost if a rollback happens
            resultSet1.insertRow();
            System.out.println("First table updated...");

            resultSet2 = statement.executeQuery("SELECT * FROM contact");
            resultSet2.moveToInsertRow();
            resultSet2.updateString("firstName", "Samuel");
            // resultSet2.updateString("firstName", "The great Samuel the billionaire from Washington DC");
            resultSet2.updateString("lastName", "Uncle");
            resultSet2.updateString("email", "sam@abc.com");
            resultSet2.updateString("phoneNum", "+119955331100");
            // updating here... but this change will be lost of a rollback happens
            resultSet2.insertRow();
            System.out.println("Both tables updated, committing now.");
            // we're committing the changes for both the tables only now
            connection.commit();
        } catch (SQLException e) {
            System.out.println(
                    "Something gone wrong, couldn't add a contact in family group");
            // roll back all the changes in the transaction since something has gone wrong
            connection.rollback();
            e.printStackTrace();
        }
        finally {
            if(connection != null) connection.close();
            if(resultSet1 != null) resultSet1.close();
            if(resultSet2 != null) resultSet2.close();
        }
    }

}
