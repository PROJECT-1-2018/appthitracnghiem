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
<<<<<<< HEAD
            con = DriverManager.getConnection("jdbc:mysql://localhost/hethongthitracnghiem","root","");
=======
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbexam","root","");
>>>>>>> e98de8ae83d69d25ea3254cb120f5023af834ea3
            st = con.createStatement();
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
    public boolean CheckStudentLogin(String username,String password){
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
    public boolean CheckStudentAdd(int id){        
        try {
            String sql = "select * from student where StudentID = '"+id+"'   ";            
            rs = st.executeQuery(sql);
            if (rs.next()) return true;            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }     
        return false;
    }
    public boolean CheckSubjectAdd(int id){        
        try {
            String sql = "select * from subjects where SubjectID = '"+id+"'   ";            
            rs = st.executeQuery(sql);
            if (rs.next()) return true;            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }     
        return false;
    }
    public static void main(String[] args) {
        CheckDB check = new CheckDB();
        boolean x = check.CheckStudentAdd(23);
        if (x) System.out.println("có"); else System.out.println("không có ");
    }
}
