package com.vladproduction.c10_building_DB_App_with_JDBC.querying_and_updating_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * focus on retrieving the ResultSet and modifying the ResultSet
 * and the database.
 * here is example where update is not throwing any exception, but not update also!))
 * look up at the example: DbUpdate2
 * */
public class DbUpdate {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DbConnector.connectToDb();
//             Statement statement = connection.createStatement();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM contact WHERE firstName=\"Michael\"")) {
            // first fetch the data and display it before the update operation
            System.out.println("Before the update");
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
            System.out.println("After the update");
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
        //output:
        /*Before the update
        id 	fName 	lName 	email 		phoneNum
        1	Michael	Taylor	michael@abc.com	+919876543210
        After the update
        id 	fName 	lName 	email 		phoneNum
        1	Michael	Taylor	michael@abc.com	+919876543210*/
    }
}
