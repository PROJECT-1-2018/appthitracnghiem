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
public class Answer {
    private  int AnswerID;
    private String AnswerContent;
    private int QuestionID;
    private boolean IsTrue;

    public Answer() {
    }

    public int getAnswerID() {
        return AnswerID;
    }

    public void setAnswerID(int AnswerID) {
        this.AnswerID = AnswerID;
    }

    public String getAnswerContent() {
        return AnswerContent;
    }

    public void setAnswerContent(String AnswerContent) {
        this.AnswerContent = AnswerContent;
    }

    public int getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(int QuestionID) {
        this.QuestionID = QuestionID;
    }

    public boolean isIsTrue() {
        return IsTrue;
    }
    
}
