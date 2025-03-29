package com.fundamentals.java.designpatterns.objectpooldesignpattern;

public class Client {
    public static void main(String[] args) {
        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getDBConnectionPoolManager();

        DBConnection dbConnection1 = dbConnectionPoolManager.getConnection();
        DBConnection dbConnection2 = dbConnectionPoolManager.getConnection();

        dbConnectionPoolManager.releaseDBConnection(dbConnection2);

    }
}
