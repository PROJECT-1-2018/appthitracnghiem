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
import java.util.ArrayList;
import object.Answer;
import object.Questions;
import object.Student;
import object.Subject;
import object.StudentResult;
import object.Topic;

/**
 *
 * @author DuongSon
 */
public class GetDB {
    private Connection con ;
    private Statement st;
    private ResultSet rs;
    
    public GetDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbexam2","root","");
            st = con.createStatement();
        } catch (Exception exception){
            System.out.println(exception);
        }
    }    
    
    public ArrayList getListSubject(){ // lay du lieu cua subject cho vao mot danh sach arraylist
        ArrayList<Subject> listSubjects = new ArrayList<Subject>();
        try {
           String query = "select * from subjects";
            rs = st.executeQuery(query);
            while (rs.next()){                
                listSubjects.add(new Subject(rs.getInt("SubjectID"),rs.getString("SubjectName")));                
            }
        } catch (Exception e) {
        }
        return listSubjects;
    }
    public String getNameSubject(int id){ // lay du lieu cua subject cho vao mot danh sach arraylist
        String name="";
        try {
           String query = "select * from subjects where SubjectID='"+id+"'";
            rs = st.executeQuery(query);
            while (rs.next()){                
              name = rs.getString("SubjectName");                
            }
        } catch (Exception e) {
        }
        return name ;
    }
    public ArrayList getListTopic(int subjectID ){ // lay du lieu cua subject cho vao mot danh sach arraylist
        ArrayList<Topic> listTopic = new ArrayList<>();
        try {
           String query = "select * from topic where SubjectID = '"+subjectID+"'";
            rs = st.executeQuery(query);
            while (rs.next()){                
                listTopic.add(new Topic(rs.getInt("TopicID"),rs.getInt("SubjectID"),rs.getString("TopicName")));                
            }
        } catch (Exception e) {
        }
        return listTopic;
    }
    public ArrayList getListTopic () {
        ArrayList <Topic> listTopicName = new ArrayList<Topic> ();
        try {
            String query = "Select * From Topic";
            rs = st.executeQuery(query);
            while (rs.next()){
                listTopicName.add(new Topic(rs.getInt("topicID"), rs.getInt("subjectID"), rs.getString("topicName")));
            }
        }catch (Exception ex){
             ex.printStackTrace();
        }
        return listTopicName;
    }
    public ArrayList getListStudent(){ // lay du lieu cua subject cho vao mot danh sach arraylist
        ArrayList<Student> listStudents = new ArrayList<Student>();
        try {
           String query = "select * from student";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 Student s = new Student(rs.getString("StudentName"),rs.getInt("StudentID"),
                                         rs.getString("Class"),rs.getDate("Birthday"));
                 listStudents.add(s);
                 
            }
        } catch (Exception e) {
        }
        return listStudents;
    }
    
    public ArrayList getListQuestion(){ // lay du lieu cua subject cho vao mot danh sach arraylist
        ArrayList<Questions> listQuestionses = new ArrayList<Questions>();
        try {
           String query = "select * from question";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 Questions questions = new Questions(rs.getInt("QuestionID"),rs.getString("QuestionContent"),
                                         rs.getInt("TopicID"),rs.getInt("QuestionLevel"));
                 listQuestionses.add(questions);                 
            }
        } catch (Exception e) {
        }
        return listQuestionses;
    }
    
    public ArrayList getListQuestionFromTopic(int id){ // tim cau hoi dua vao chu de
        ArrayList<Questions> listQuestionses = new ArrayList<Questions>();
        try {
           String query = "select * from question where TopicID = '"+id+"' ";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 Questions questions = new Questions(rs.getInt("QuestionID"),rs.getString("QuestionContent"),
                                         rs.getInt("TopicID"),rs.getInt("QuestionLevel"));
                 listQuestionses.add(questions);                 
            }
        } catch (Exception e) {
        }
        return listQuestionses;
    }
    
    public ArrayList getListQuestionFromID(int id){ // tim cau hoi dua vao chu de
        ArrayList<Questions> listQuestionses = new ArrayList<Questions>();
        try {
           String query = "select * from question where QuestionID = '"+id+"' ";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 Questions questions = new Questions(rs.getInt("QuestionID"),rs.getString("QuestionContent"),
                                         rs.getInt("TopicID"),rs.getInt("QuestionLevel"));
                 listQuestionses.add(questions);                 
            }
        } catch (Exception e) {
        }
        return listQuestionses;
    }
    public ArrayList getListAnswerFromQuestion(int id){ // tim cau hoi dua vao chu de
        ArrayList<Answer> listAnswers = new ArrayList<Answer>();
        
        try {
           String query = "select * from answer where QuestionID = '"+id+"' ";
            rs = st.executeQuery(query);
            while (rs.next()){                              
                 Answer answer = new Answer(rs.getInt("AnswerID"),rs.getString("AnswerContent"),
                                         rs.getInt("QuestionID"),rs.getBoolean("IsTrue"));
                 listAnswers.add(answer);                 
            }
        } catch (Exception e) {
        }
        return listAnswers;
    }
    public ArrayList getListStudentResult(){ // lay du lieu cua result cho vao mot danh sach arraylist
        ArrayList<StudentResult> listStudentResult = new ArrayList<StudentResult>();
        try {
           String query = "SELECT student.StudentID, student.StudentName, student.Class, student.Birthday, result.point, topic.TopicName, subjects.SubjectName FROM student, result, test, topic, subjects WHERE (student.StudentID = result.StudentID)AND(test.TopicID = topic.TopicID)AND(test.TopicID = topic.TopicID)AND(topic.SubjectID = subjects.SubjectID)AND(result.TestID = test.TestID)";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 StudentResult sr = new StudentResult(rs.getInt("StudentID"), rs.getString("StudentName"), 
                                         rs.getString("Class"), rs.getString("Birthday"), rs.getString("SubjectName"), rs.getString("TopicName") ,rs.getFloat("point"));
                listStudentResult.add(sr);
                 
            }
        } catch (Exception e) {
        }
        return listStudentResult;
    }
    
    public ArrayList findStudentFrId(String str){ 
        ArrayList<Student> listStdId = new ArrayList<Student>();
        try {
           String query = "select * from student where StudentID = ";
            rs = st.executeQuery(query+str);
            while (rs.next()){                
                 Student s = new Student(rs.getString("StudentName"),rs.getInt("StudentID"),
                                         rs.getString("Class"),rs.getDate("Birthday"));
                 listStdId.add(s);
                 
            }
        } catch (Exception e) {
        }
        return listStdId;
    }
    
    public ArrayList findStudentFrName(String str){ 
        ArrayList<Student> listStd = new ArrayList<Student>();
        try {
           String query = "select * from student where StudentName like ";
            rs = st.executeQuery(query+"'%"+str+"%'");
            while (rs.next()){                
                 Student s = new Student(rs.getString("StudentName"),rs.getInt("StudentID"),
                                         rs.getString("Class"),rs.getDate("Birthday"));
                 listStd.add(s);
                 
            }
        } catch (Exception e) {
        }
        return listStd;
    }
    
    
    public static void main(String[] args) {
        GetDB get = new GetDB();
        ArrayList<Subject> ar = get.getListSubject();
        System.out.println(ar.get(0).getSubjectName());
    }
}
