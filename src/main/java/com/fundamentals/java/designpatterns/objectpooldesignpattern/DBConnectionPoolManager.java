package com.fundamentals.java.designpatterns.objectpooldesignpattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private static DBConnectionPoolManager dbConnectionPoolManager;
    private List<DBConnection> freeConnectionsInPool = new ArrayList<>();
    private List<DBConnection> connectionInUse = new ArrayList<>();
    private int INITIAL_POOL_SIZE = 3;
    private int MAX_POOL_SIZE = 6;

    public DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeConnectionsInPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getDBConnectionPoolManager() {
        if (dbConnectionPoolManager == null) {
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManager == null) {
                    dbConnectionPoolManager = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManager;
    }

    public synchronized DBConnection getConnection() {
        if (freeConnectionsInPool.isEmpty() && connectionInUse.size() < MAX_POOL_SIZE) {
            freeConnectionsInPool.add(new DBConnection());
        } else if (freeConnectionsInPool.isEmpty() && connectionInUse.size() >= MAX_POOL_SIZE) {
            //max pool size limit reached
            return null;
        }
        DBConnection dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size() - 1);
        connectionInUse.add(dbConnection);
        return dbConnection;
    }

    public synchronized void releaseDBConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            connectionInUse.remove(dbConnection);
            freeConnectionsInPool.add((dbConnection));
        }
    }
}
