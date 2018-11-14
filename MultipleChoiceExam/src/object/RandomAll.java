/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;


import java.util.*; 
/**
 *
 * @author DuongSon
 */
public class RandomAll {
        
    public String createRandom(int len){
        String result ="";
        String source = "zxcvbnmasdfghjklqwertyuiopMNBVCXZLKJAHGFSDPOIUYTREWQ";
        for (int i=0; i<len; i++){
            int rand = new Random().nextInt(source.length());
            result += source.charAt(rand);            
        }
        return result;
    }
}
