/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.Date;


public class Result {
    private int resultID;
    private Date resultDate;
    private float points;
    private int testID;
    
    public Result (int resultID, Date resultDate, float points, int testID){
        this.resultID = resultID;
        this.resultDate = resultDate;
        this.points = points;
        this.testID = testID;
        
    }

    public int getResultID() {
        return resultID;
    }

    public void setResultID(int resultID) {
        this.resultID = resultID;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public void setResultDate(Date resultDate) {
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
