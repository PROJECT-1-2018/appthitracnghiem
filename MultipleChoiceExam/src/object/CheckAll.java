/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.ArrayList;

/**
 *
 * @author DuongSon
 */
public class CheckAll {
    public boolean isData(String s){
        if (s.equals("")) return false;
        return true;
    }
    public boolean  checkStudentExist(ArrayList<InforLoginStudent> infor , int id){
        for (InforLoginStudent s :infor){
            if (s.getStudentID() == id) return false;
        }
        return  true;
    }
    
}
