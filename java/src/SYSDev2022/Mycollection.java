/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SYSDev2022;

/**
 *
 * @author TRAINING2
 */
import java.util.*;
import java.util.Collections;
public class Mycollection {
 
public static void main(String[] args)
{
 List<Integer> luckyNumber = new ArrayList<Integer>();
            luckyNumber.add(33);
            luckyNumber.add(20);
            luckyNumber.add(11);
            luckyNumber.add(22);
    
         
         // 11 is present at index 2.
         // 22 is present at index 3.
        int index = Collections.binarySearch(luckyNumber, 11);
        System.out.println(index);
        index = Collections.binarySearch(luckyNumber, 22);
        System.out.println(index);
        
        // 13 is not present. 13 would have been inserted
        index = Collections.binarySearch(luckyNumber, 13);
        System.out.println(index);
    
    
} 
    
     
    
}


