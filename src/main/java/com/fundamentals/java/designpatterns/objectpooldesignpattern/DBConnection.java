package com.fundamentals.java.designpatterns.objectpooldesignpattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection mysqlConnection;

    DBConnection() {
        try {
            mysqlConnection = DriverManager.getConnection("url", "userName", "password");
        } catch (Exception e) {
            //handle exception
        }
    }
}
