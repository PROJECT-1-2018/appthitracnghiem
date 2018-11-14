/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HoangViet
 */
public class Test {
    private int testID;
    private int amountQuestion;
    private int topicID;
    private int testTime;
    private int level1;
    private int level2;
    private int level3;
    private String listQuestion;
    private int maxPoint;
    
    public Test(){
        
    }
    public Test(int testID, int amountQuestion, int TopicID, int testTime, int Level1, int Level2,int Level3, int maxPoint){
        this.amountQuestion = amountQuestion;
        this.testID = testID;
        this.topicID = TopicID;
        this.testTime = testTime;
        this.level1 = Level1;
        this.level2 = Level2;
        this.level3 = Level3;
        this.maxPoint = maxPoint;
    }
    public void setTestID (int testID){
        this.testID = testID;
    }
    public int getTestID (){
        return testID;
    }
    
    public void setAmountQuestion (int amountQuestion){
       this.amountQuestion = amountQuestion;
    }
    public int getAmountQuestion (){
        return amountQuestion;
    }
    
    public void setTopicID (int topicID){
        this.topicID = topicID;
    }
    public int getTopicID (){
        return topicID;
    }
    
    public void setTestTime (int testTime){
       this.testTime = testTime;
    }
    public int getTestTime (){
        return testTime;
    }
    
    public void setLevel1 (int level1){
       this.level1 = level1;
    }
    public int getLevel1 (){
        return level1;
    }
    
    public void setLevel2 (int level2){
       this.level2 = level2;  
    }
    public int getLevel2 (){
       return level2;
    }
    
    public void setLevel3 (int level3){
        this.level3 = level3;
    }
    public int getLevel3 (){
        return level3;
    }
    
    public void listQuestion (String listQuestion){
        this.listQuestion = listQuestion;
    }
    public String getListQuestion (){
        return listQuestion;
    }
    
    public void setMaxPoint (int maxPoint){
        this.maxPoint = maxPoint;
    }
    
    public int getMaxPoint (){
        return maxPoint;
    }
    
    
    
    
    
}