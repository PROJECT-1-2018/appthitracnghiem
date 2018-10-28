/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Viet
 */
public class CreateTest {
    private int questionID;
    private int testID;
    
    public void setTestID (int testID){
        this.testID = testID;
    }
    public int getTestID (){
        return testID;
    }
    
    public void setquestionID (int questionID){
        this.questionID = questionID;
    }
    public int getQuestionID (){
        return questionID;
    }
    
}