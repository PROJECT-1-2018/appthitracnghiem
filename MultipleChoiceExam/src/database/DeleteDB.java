/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DuongSon
 */
public class DeleteDB {
    private Connection con ;
    private Statement st;
    private ResultSet rs;
    
    public DeleteDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbexam","root","");
            st = con.createStatement();
        } catch (Exception exception){
            System.out.println(exception);
        }
    }    
}
