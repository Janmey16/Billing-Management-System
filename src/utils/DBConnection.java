/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PRA
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root@123"); // Abhi daal url
                        
        } catch (SQLException e) {
            System.out.println("Exception @Connection:" +e);
        }
        return conn;
    }
}
