package com.training.designpatterns.creational.singleton.database;

public class DatabaseConnectionManager {

    String connectionUrl;

    private DatabaseConnectionManager(){
        this.connectionUrl="jdbc:postgresql://localhost:5432/app_db";
        System.out.println("Yeni Connection açıldı");
    }
    private static class Holder{
        private static final DatabaseConnectionManager INSTANCE = new DatabaseConnectionManager();
    }
    public static DatabaseConnectionManager getInstance(){
        return Holder.INSTANCE;
    }
    public void executeQuery(String  sql){
        System.out.println("["+ this.hashCode() + "] " + (connectionUrl) +"üzerinden  Sql çalıştırıldı "+ sql);
    }
}
