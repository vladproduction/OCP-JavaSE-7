package com.vladproduction.c10_building_DB_App_with_JDBC.performing_transactions;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 * // To illustrate how to use RowSet, RowSetProvider, and RowSetFactory
 * */
public class DbQuery5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/abook";
        String userName = "root";
        String password = "11111111";
        try {
            // first, create a factory object for rowset
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            // create a JDBC rowset from the factory
            JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
            rowSet.setUrl(url);
            rowSet.setUsername(userName);
            rowSet.setPassword(password);
            rowSet.setCommand("SELECT * FROM contact");
            rowSet.execute();
            System.out.println("id \tfName \tlName \temail \t\tphoneNum");
            while (rowSet.next()){
                System.out.println(rowSet.getInt("id") + "\t"
                        + rowSet.getString("firstName") + "\t"
                        + rowSet.getString("lastName") + "\t"
                        + rowSet.getString("email") + "\t"
                        + rowSet.getString("phoneNum"));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
