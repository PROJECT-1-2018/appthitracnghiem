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
public class Questions {
    
    private int questionID;
    private String questionContent;
    private int topicID;
    private int questionLevel;
     private int index;

     public Questions(){
        
    }
     public Questions(int index, int questionID, String questionContent,int topicID,int questionLevel){
        this.questionID = questionID;
        this.questionContent = questionContent;
        this.topicID = topicID;
        this.questionLevel = questionLevel;
        this.index = index;
    }

    public Questions(int questionID, String questionContent,int topicID,int questionLevel){
        this.questionID = questionID;
        this.questionContent = questionContent;
        this.topicID = topicID;
        this.questionLevel = questionLevel;
    }
    public void setIndex( int index){
        this.index = index;
    }
    public int getIndex (){
        return index;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    public int getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(int questionLevel) {
        this.questionLevel = questionLevel;
    }    
}

   
    
