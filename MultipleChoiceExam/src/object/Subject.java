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
public class Subject {
    private int subjectID;
    private String subjectName;

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
    public Subject(int subjectID, String subjectName ){
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }
    
    
}
