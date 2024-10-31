package com.vladproduction.c10_building_DB_App_with_JDBC.connecting_DB_by_JDBC_driver;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * been added to pom.xml:
 * <dependency>
 *      <groupId>mysql</groupId>
 *      <artifactId>mysql-connector-java</artifactId>
 *      <version>8.0.33</version>
 * </dependency>
 * */
public class DbConnect {
    public static void main(String[] args) {
        // url points to jdbc protocol : mysql subprotocol; localhost is the address
        // of the server where we installed our DBMS (i.e. on local machine) and
        // 3306 is the port on which we need to contact our DBMS
        String url = "jdbc:mysql://localhost:3306/";
        // we are connecting to the addressBook database we created earlier
        String database = "abook";
        // we login as "root" user with password "11111111"
        String userName = "root";
        String password = "11111111";
        try (Connection connection = DriverManager.getConnection(url + database, userName, password)){
            System.out.println("Database connection: Successful");
        } catch (Exception e) {
            System.out.println("Database connection: Failed");
            e.printStackTrace();
        }
    }
}
