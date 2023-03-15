package com.example;

public class CustomerDalOracle implements ICustomerDal{
    private String databaseName = "Oracle";
    private String author;
    private String email;
    private String connectionUrl;

    public String getAuthor() {
        return author;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void add() {
        System.out.println(getDatabaseName() +" connection success. Connection Url: " + getConnectionUrl());
        System.out.println("Author: "+getAuthor()+" E-mail: "+getEmail());
    }
}
