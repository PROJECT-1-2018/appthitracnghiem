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
    private  int answerID;
    private String answerContent;
    private int questionID;
    private boolean isTrue;

    public Answer(int answerID, String answerContent, int questionID, boolean isTrue) {
        this.answerID = answerID;
        this.answerContent = answerContent;
        this.questionID = questionID;
        this.isTrue = isTrue;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public boolean isIsTrue() {
        return isTrue;
    }

    public void setIsTrue(boolean isTrue) {
        this.isTrue = isTrue;
    }

}