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
import object.Test;
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
    public String getNameSubject(int id){ // 
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
    public ArrayList getListTopic(int subjectID ){ // 
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
    public int getNumberOfQuestion(){ // lay du lieu cua subject cho vao mot danh sach arraylist   
        int number = 0;
        try {
           String query = "select count(*) as number from question";
            rs = st.executeQuery(query);
            while (rs.next()){       
                number = rs.getInt("number");                                           
            }
        } catch (Exception e) {
        }
        return number;
    }
    public String getNameStudentFromID(int id){ // lay du lieu cua subject cho vao mot danh sach arraylist   
        String s ="";
        try {
           String query = "select StudentName from student where StudentID = '"+id+"' ";
            rs = st.executeQuery(query);
            while (rs.next()){       
                s = rs.getString("StudentName");                                           
            }
        } catch (Exception e) {
        }
        return s;
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
    
    public ArrayList getListTest(){ 
        ArrayList<Test> listTest = new ArrayList<>();
        try {
           String query = "select * from Test";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 Test t = new Test(rs.getInt("TestID"),rs.getInt("AmountQuestion"),rs.getInt("TopicID"),
                                   rs.getInt("TestTime"),rs.getInt("Level1"),rs.getInt("Level2"),
                                   rs.getInt("Level3"),rs.getInt("MaxPoint"));
                 listTest.add(t);
                 
            }
        } catch (Exception e) {
        }
        return listTest;
    }
    public ArrayList getListTestFromTopic(int topicID){ 
        ArrayList<Test> listTest = new ArrayList<>();
        try {
           String query = "select * from Test where TopicID = '"+topicID+"' ";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 Test t = new Test(rs.getInt("TestID"),rs.getInt("AmountQuestion"),rs.getInt("TopicID"),
                                   rs.getInt("TestTime"),rs.getInt("Level1"),rs.getInt("Level2"),
                                   rs.getInt("Level3"),rs.getInt("MaxPoint"));
                 listTest.add(t);
                 
            }
        } catch (Exception e) {
        }
        return listTest;
    }
     public String findNameTopFrId(int id){ 
        String s = null;
        try {
           String query = "select TopicName from Topic where TopicID = ";
            rs = st.executeQuery(query+ id);
            while (rs.next()){                
                 s =rs.getString("TopicName");     
            }
        } catch (Exception e) {
        }
        return s;
    }
     public String findNameSubFrTop(int id){ 
        String s = null;
        try {
           String query = "select SubjectName from Subjects,Topic where (Topic.SubjectID = Subjects.SubjectID) and (TopicID = ";
            rs = st.executeQuery(query+ id +")");
            while (rs.next()){                
                 s =rs.getString("SubjectName");     
            }
        } catch (Exception e) {
        }
        return s;
    }
    
    public ArrayList getListLevel (int idTopic, int level ) {
        ArrayList <Questions> listLv = new ArrayList<> ();
        try {
            String q1 = "Select * From Question where (TopicId = ";
            String q2 = "and ( QuestionLevel = ";
            rs = st.executeQuery(q1+ idTopic+")" + q2+ level +")");
            while (rs.next()){
                listLv.add(new Questions(rs.getInt("QuestionID"), rs.getString("QuestionContent"), 
                        rs.getInt("TopicID"), rs.getInt("QuestionLevel")));
            }
        }catch (Exception ex){
             ex.printStackTrace();
        }
        return listLv;
    }
    public int countQuestionLevel (int idTopic, int level){
        int count = 0;
        try {
           String query = "select count(QuestionID) from Question where (QuestionLevel = '"+level+"') and (TopicID = '"+idTopic+"') ";
            rs = st.executeQuery(query);
            while (rs.next()){                
                 count =rs.getInt("count(QuestionID)");     
            }
        } catch (Exception e) {
        }
        return count;
        
    }
    public static void main(String[] args) {
        GetDB get = new GetDB();
        ArrayList<Subject> ar = get.getListSubject();
        System.out.println(ar.get(0).getSubjectName());
    }
}
