/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.sql.Date;

/**
 *
 * @author Nguyen Viet Tien
 */
public class Student {
    private int studentID;
    private String studentName;  
    private String class_st;
    private Date birthday;
    
    private int testId;

    public Student(int studentID, String studentName, String class_st, Date birthday, int testId, float points, String resultDate) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.class_st = class_st;
        this.birthday = birthday;
        this.testId = testId;
        this.points = points;
        this.resultDate = resultDate;
    }
    private float points;    
    private String resultDate;
    
    public Student(){}
    public Student (String studentName, int studentID, String class_st, Date birthday) {
    this.studentName = studentName;
    this.studentID = studentID;
    this.class_st = class_st;
    this.birthday = birthday;
    }

    public float getPoints() {
        return points;
    }

    public int getTestId() {
        return testId;
    }

    public String getResultDate() {
        return resultDate;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
