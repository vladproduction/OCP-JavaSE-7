package com.vladproduction.c10_building_DB_App_with_JDBC.querying_and_updating_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * // Program to illustrate how to query a database
 * */
public class DbQuery {
    public static void main(String[] args) {
        // Get connection, execute query, get the result set
        // and print the entries from the result rest
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")){
            System.out.println("ID \tfName \tlName \temail \t\tphoneNo");
//            columnLabelsVersion(resultSet);
//            columnIndexesVersion(resultSet);
            columns_If_not_knowing_rows_and_data_Version(resultSet);
        }
        catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }

    private static void columnLabelsVersion(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t"
                    + resultSet.getString("firstName") + "\t"
                    + resultSet.getString("lastName") + "\t"
                    + resultSet.getString("email") + "\t"
                    + resultSet.getString("phoneNum"));
        }
    }

    // modified code inside the while loop to use column numbers instead:
    private static void columnIndexesVersion(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1)
                    + "\t" + resultSet.getString(2)
                    + "\t" + resultSet.getString(3)
                    + "\t" + resultSet.getString(4)
                    + "\t" + resultSet.getString(5));
        }
    }

    // from resultSet metadata, find out how many columns are there and then read the column entries
    private static void columns_If_not_knowing_rows_and_data_Version(ResultSet resultSet) throws SQLException {
        int numOfColumns = resultSet.getMetaData().getColumnCount();
        while (resultSet.next()) {
            // remember that the column index starts from 1 not 0
            for(int i = 1; i <= numOfColumns; i++) {
                // since we do not know the data type of the column, we use getObject()
                System.out.print(resultSet.getObject(i) + "\t");
            }
            System.out.println("");
        }
    }
}
