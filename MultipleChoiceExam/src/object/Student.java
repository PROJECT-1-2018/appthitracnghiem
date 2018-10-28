/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Nguyen Viet Tien
 */
public class Student {
    private String studentName;
    private int studentID;
    private String class_st;
    private String birthday;
    
    
    public Student (String studentName, int studentID, String class_st, String birthday) {
    this.studentName = studentName;
    this.studentID = studentID;
    this.class_st = class_st;
    this.birthday = birthday;
    

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
