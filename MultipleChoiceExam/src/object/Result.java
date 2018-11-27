/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.time.LocalDate;
import java.util.Date;


public class Result {
    private int resultID;
    private String resultDate;
    private float points;
    private int testID;
    private int studentID;
    
    public Result (float point,int testID, String resultDate, int studentID){
        this.studentID = studentID;
        this.resultDate = resultDate;
        this.points = point;
        this.testID = testID;
        
    }
    
     public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    

    public int getResultID() {
        return resultID;
    }

    public void setResultID(int resultID) {
        this.resultID = resultID;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }
    
}