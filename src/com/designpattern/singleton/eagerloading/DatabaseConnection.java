package com.designpattern.singleton.eagerloading;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection=new DatabaseConnection();

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){

        return databaseConnection;
    }
}
