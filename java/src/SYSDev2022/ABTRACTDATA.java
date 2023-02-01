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
public class ABTRACTDATA {
  public static void main(String[]args) {  
 ArrayList<Integer> yearsofEmp =  new  ArrayList();
      
yearsofEmp.add(2002);
yearsofEmp.add(2019);
yearsofEmp.add(2010);
yearsofEmp.remove(2);
for (int empyears : yearsofEmp)  
{
 System.out.println(empyears);
}
System.out.println(yearsofEmp.isEmpty());
  }
}