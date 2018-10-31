/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import object.Answer;
import object.Questions;
import object.Result;
import object.Student;
import object.Subject;
import object.Test;
import object.Topic;

/**
 *
 * @author DuongSon
 */
public class UpdateDB {
   
    private Connection connect(){
        Connection con= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbexam","root","");         
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public void dbStudents(Student st){             // cap nhat thong tin sinh vien vào db
        String sql ="INSERT INTO student(StudentID,StudentName,Class,Birthday) VALUES(?,?,?,?)";
        try ( Connection con = this.connect(); 
                PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,st.getStudentID());              // not auto 
            p.setString(2,st.getStudentName());
            p.setString(3,st.getClass_st());
            p.setString(4,st.getBirthday());          
            p.executeUpdate();
            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
    }
    public void dbSubject(Subject sub){             // cap nhat mon hoc 
        String sql ="INSERT INTO subjects VALUES(?,?)";        
        try ( Connection con = this.connect(); 
                PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,sub.getSubjectID());             // not auto 
            p.setString(2,sub.getSubjectName());             
            p.executeUpdate();
            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
    }
    public void dbTopic(Topic topic){               // cap nhat chu de
        String sql ="INSERT INTO topic VALUES(?,?,?)";
        try ( Connection con = this.connect(); PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,topic.getTopicID());
            p.setInt(2,topic.getSubjectID());
            p.setString(3,topic.getTopicName());            
            p.executeUpdate();
            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
    }
    public void dbQuestion(Questions que){          // cap nhat cau hoi 
        String sql ="INSERT INTO question VALUES(?,?,?,?)";
        try ( Connection con = this.connect(); PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,que.getQuestionID());
            p.setString(2,que.getQuestionContent());
            p.setInt(3,que.getTopicID());
            p.setInt(4,que.getQuestionLevel());          
            p.executeUpdate();
            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
    }
    public void dbAnswer(Answer ans){   // cap nhat cau tra loi 
        String sql ="INSERT INTO answer VALUES(?,?,?,?)";
        try ( Connection con = this.connect(); PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,ans.getAnswerID());
            p.setString(2,ans.getAnswerContent());
            p.setInt(3,ans.getQuestionID());             
            p.setBoolean(4,ans.isIsTrue());
            p.executeUpdate();            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
    }
    public void dbTest(Test test){                  // cap nhat de thi 
        String sql ="INSERT INTO test VALUES(?,?,?,?,?,?,?)";
        try ( Connection con = this.connect(); PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,0);
            p.setInt(2,test.getAmountQuestion());
            p.setInt(3,test.getTopicID());
            p.setInt(4,test.getTestTime());
            p.setInt(5,test.getLevel1());
            p.setInt(6,test.getLevel2());
            p.setInt(7,test.getLevel3());                        
            p.executeUpdate();            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
    }
    public void dbResult(Result res){           // cap nhat ketqua
        String sql ="INSERT INTO result VALUES(?,?,?,?)";
        try ( Connection con = this.connect(); PreparedStatement p = con.prepareStatement(sql)){
            p.setInt(1,0);
            p.setDate(2, (Date)res.getResultDate());
            p.setFloat(3,res.getPoints());
            p.setInt(4,res.getTestID());                               
            p.executeUpdate();            
        } catch (SQLException e) {
               System.out.println(e.getMessage());
        }
    }
}
// try to use github
