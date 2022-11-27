package com.eulbyvan.springcoredemo;

public class Database {
    private static Database db;

    public static Database getInstance() {
        if (db == null) db = new Database();
        return db;
    }

    private Database() {}
}
