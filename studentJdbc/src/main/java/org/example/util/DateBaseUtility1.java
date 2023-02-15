package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DateBaseUtility1 {

    private static final String DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/student1";
    private static final String DATABASE_USER_NAME = "root";
    private static final String DATABASE_PASSWORD = "root";
    public  DateBaseUtility1() throws ClassNotFoundException {


    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL,DATABASE_USER_NAME,DATABASE_PASSWORD);
    }

}
