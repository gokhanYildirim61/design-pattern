package com.training.designpatterns.creational.singleton.database;

public class DatabaseConnectionDemo {
    public static void main(String[] args){
        System.out.println("Run");

        DatabaseConnectionManager connection1 = DatabaseConnectionManager.getInstance();
        connection1.executeQuery("select * from tableName");

        DatabaseConnectionManager connection2 = DatabaseConnectionManager.getInstance();
        connection2.executeQuery("UPDATE tableName SET status = 'ACTIVE' WHERE id = 1");

        System.out.println("Nesne kontrolü " + (connection1==connection2));
        System.out.println("Connection1 HashCode" + (connection1.hashCode()));
        System.out.println("Connection2 HashCode" + (connection2.hashCode()));
    }
}
