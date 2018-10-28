/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DuongSon
 */
public class ConnectDB {
    public static Connection getConnect(){
        Connection con= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_exam","root","");  
            return con;
        } catch (Exception exception){
            System.out.println(exception);
            return null;
        }
        
    }
}
