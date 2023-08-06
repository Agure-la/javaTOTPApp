/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author odenyagure
 */
public class DbConnection {
    String url = "jdbc:mysql://localhost:3306/mydatabase";
String user = "root";
String password = "password";

    public static Connection connect(){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "password");
            return con;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
}
