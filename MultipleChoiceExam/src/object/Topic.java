/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author DuongSon
 */
public class Topic {
    private int topicID,subjectID;
    private String topicName;

    public Topic(){}
    public Topic(int topicID, int subjectID, String topicName){
        this.topicID = topicID;
        this.subjectID = subjectID;
        this.topicName = topicName;
    }
    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }
    

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
    
    
    
}
