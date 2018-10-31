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
public class CheckDB {
    private Connection con ;
    private Statement st;
    private ResultSet rs;
    
    public CheckDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbexam","root","");
            st = con.createStatement();
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
    public boolean CheckStudent(String username,String password){
        try {
            String sql = "select * from createsignin where UserName = ' " + username +" ' and UserPw = '"+password+"'";
            rs = st.executeQuery(sql);
            if (rs.next()) return true;            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }     
        return false;
    }
    public boolean CheckTeacher(String username,String password){               
        return (username.equals("root") && password.equals("duong") ) ;       
    }
    public static void main(String[] args) {
        CheckDB check = new CheckDB();
        boolean x = check.CheckTeacher("root","duong");
        if (x) System.out.println("có"); else System.out.println("không có ");
    }
}
