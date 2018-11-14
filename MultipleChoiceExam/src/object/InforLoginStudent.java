/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.Random;

/**
 *
 * @author DuongSon
 */
public class InforLoginStudent {
    private int studentID, testID;
    private String userName, userPw;

    public InforLoginStudent(int studentID, String userName, String userPw,int testID) {
        this.studentID = studentID;
        this.testID = testID;
        this.userName = userName;
        this.userPw = userPw;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }
    
}
