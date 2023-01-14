package main.database;

import java.sql.Connection;
import java.sql.DriverManager;


public class config {

    private Connection conn;
    public Connection getConnection() { 

        try {
            
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbURL = "jdbc:mysql://127.0.0.1:3306/ae-system";
            String user = "joshrjhermtab";
            String password = "almazan_123";

            Class.forName(driver);
            conn = DriverManager.getConnection(dbURL, user, password);
            return conn;

        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    
    
}


