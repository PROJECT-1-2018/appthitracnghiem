/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DuongSon
 */
public class InforLoginStudent {
    private int studentID, testID, roomID,topicId;

    public int getRoomID() {
        return roomID;
    }

    public InforLoginStudent() {
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
    private String userPw, studentName, topicName;

    public InforLoginStudent( int roomID,int studentID,String userPw,int testID) {
        this.studentID = studentID;
        this.testID = testID;
        this.roomID = roomID;
        this.userPw = userPw;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
    
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public InforLoginStudent(int studentID, int testID, String userPw, String studentName) {
        this.studentID = studentID;
        this.testID = testID;
        this.userPw = userPw;
        this.studentName = studentName;
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

   

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }    
}
