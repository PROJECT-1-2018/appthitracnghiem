/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Giang Le
 */
public class StudentResult {
    private String studentName;
    private int studentID;
    private String class_st;
    private String birthday;
    private float point;
    private String topic;
    private String subject;

    public StudentResult( int studentID, String studentName, String class_st, String birthday, String subject, String topic, float point) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.class_st = class_st;
        this.birthday = birthday;
        this.point = point;
        this.topic = topic;
        this.subject = subject;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
    

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getClass_st() {
        return class_st;
    }

    public void setClass_st(String class_st) {
        this.class_st = class_st;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    
    
}
