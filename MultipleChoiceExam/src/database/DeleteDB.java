/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import object.Student;
import object.Topic;

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
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbexam2","root","");
            st = con.createStatement();
        } catch (Exception exception){
            System.out.println(exception);
        }        
    }    
    
    public void deleteSubject(int id){
        String sql = "DELETE FROM subjects WHERE SubjectID = ?";
        try (PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,id);
            p.executeUpdate();
        } catch (Exception e) {
        }        
    }
     public void DelStudent(Student st){
        String query = " delete from student where StudentID = ?";
        try ( PreparedStatement p = con.prepareStatement(query)){
            p.setInt(1,st.getStudentID() );
            p.executeUpdate();
            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
        
        
    }
     
     public void deleteTopic (int id ){
         String query = "delete from topic where topicID = ?";
         try (PreparedStatement p = con.prepareStatement(query)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception ex){
            
         }
     }
    
    public static void main(String[] args) {
        DeleteDB de = new DeleteDB();
        de.deleteSubject(1);
    }
}
