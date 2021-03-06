package com.company.w9HW;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        System.out.println("If here will be the same numbers, so it works " + "\n" +
                "If here will be different numbers, so 2 singletones are created, that means it's incorrect" + "\n\n" +
                "RESULT:" + "\n");
        Database singleton = Database.getInstance();
        Database anotherSingleton = Database.getInstance();
        singleton.getSql();
        anotherSingleton.getSql();
    }
}
