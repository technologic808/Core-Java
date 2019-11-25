package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * DBUtils
 */
public class DBUtils {
    public static Connection fetchConnection() {
        String url = "jdbc:mysql://localhost:3306/cdac";
        return DriverManager.getConnection(url, "root", "root");
    }
}