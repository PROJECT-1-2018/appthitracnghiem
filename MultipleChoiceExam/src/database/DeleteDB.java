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
import java.util.ArrayList;
import object.InforLoginStudent;
import object.Room;
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
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbexam2?useUnicode=true&characterEncoding=UTF-8","root","");  
            st = con.createStatement();
        } catch (Exception exception){
            System.out.println(exception);
        }        
    }    
    
    public void deleteSubject(int id){  // xoa subject -> xoa topic lien quan 
        deleteTopicFromSubject(id);
        String sql = "DELETE FROM subjects WHERE SubjectID = ?";
        try (PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,id);
            p.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }                
    }
    public void deleteRoom(int roomId){  // xoa phong thi  
        /*ArrayList<InforLoginStudent> listStudent = new GetDB().getStudentInRoom(roomId);
        for(InforLoginStudent s : listStudent){
            int studentId =  s.getStudentID();
            String query3 = "delete from result where StudentID = ?";
            try (PreparedStatement p = con.prepareStatement(query3)){
                p.setInt(1, studentId);
                p.executeUpdate();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }*/
        String sql = "DELETE FROM createsignin WHERE RoomID = ?";
        try (PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,roomId);
            p.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }                
    }
    public void deleteTopicFromSubject(int subjectID ){ //      xoa topic tu subjectID   
        try {           
                String query = "select * from topic where SubjectID = '"+subjectID+"'";
                rs = st.executeQuery(query);
                while (rs.next()){                           
                    int testID = rs.getInt("TopicID");                    
                    deleteTopic(testID);
                    System.out.println(testID+"-ok");
                    query = "select * from topic where SubjectID = '"+subjectID+"'";
                    rs = st.executeQuery(query);
                }            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }                  
    }    
              
     public void deleteTopic (int id ){
         // xoa test
         try {  // tim test lien quan den topic
           String query = "select * from test where TopicID = '"+id+"'";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 int testID = rs.getInt("TestID"); 
                 deleteTest(testID);
                 query = "select * from test where TopicID = '"+id+"'";
                 rs = st.executeQuery(query);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
         // xoa question 
         try {  // tim question lien quan den topic
           String query = "select * from question where TopicID = '"+id+"'";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 int questionID = rs.getInt("QuestionID"); 
                 deleteQuestion(questionID);
                 query = "select * from question where TopicID = '"+id+"'";
                 rs = st.executeQuery(query);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
         //xoa topic 
         String query = "delete from topic where topicID = ?";
         try (PreparedStatement p = con.prepareStatement(query)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception e){      
             System.out.println(e.getMessage());
         }
     }
     public void deleteTest(int id ){
         String query3 = "delete from result where testID = ?";
         try (PreparedStatement p = con.prepareStatement(query3)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception e){     
             System.out.println(e.getMessage());
         }
            
         String query2 = "delete from createtest where testID = ?";
         try (PreparedStatement p = con.prepareStatement(query2)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception e){  
             System.out.println(e.getMessage());
         }
         String query4 = "delete from createsignin where testID = ?";
         try (PreparedStatement p = con.prepareStatement(query4)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception e){      
             System.out.println(e.getMessage());
         }
         String query1 = "delete from test where testID = ?";
         try (PreparedStatement p = con.prepareStatement(query1)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception e){
            System.out.println(e.getMessage());
         }         
         
     }
     public void deleteQuestion(int id ){
         String query3 = "delete from createtest where QuestionID = ?";
         try (PreparedStatement p = con.prepareStatement(query3)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception e){
            System.out.println(e.getMessage());
         }
         String query2 = "delete from answer where QuestionID = ?";
         try (PreparedStatement p = con.prepareStatement(query2)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception e){
            System.out.println(e.getMessage());
         }
         String query1 = "delete from question where QuestionID = ?";
         try (PreparedStatement p = con.prepareStatement(query1)){
             p.setInt(1, id);
             p.executeUpdate();
         }catch (Exception e){
            System.out.println(e.getMessage());
         }         
         
     }
     public void DelStudent(Student st){
         String query4 = "delete from createsignin where StudentID = ?";
         try (PreparedStatement p = con.prepareStatement(query4)){
             p.setInt(1, st.getStudentID());
             p.executeUpdate();
         }catch (Exception e){            
             System.out.println(e.getMessage());
         }
         String query3 = "delete from result where StudentID = ?";
         try (PreparedStatement p = con.prepareStatement(query3)){
             p.setInt(1, st.getStudentID());
             p.executeUpdate();
         }catch (Exception e){
             System.out.println(e.getMessage());
         }
         
        String query = " delete from student where StudentID = ?";
        try ( PreparedStatement p = con.prepareStatement(query)){
            p.setInt(1,st.getStudentID() );
            p.executeUpdate();
            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
                
    }
    
    public static void main(String[] args) {
        DeleteDB de = new DeleteDB();
      //  de.deleteSubject(1);
    }
}
