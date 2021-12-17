/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;

/**
 *
 * @author PRA
 */
public class Testing {
    public static void main(String[] args) {
        DBConnection con = new DBConnection();
        Connection conn = con.getConnection();
    }
}
