/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SYSDev2022;

import java.util.Locale;

/**
 *
 * @author TRAINING2
 */
import java.util.*;
import java.time.*;
public class DataType {
  public static void main (String[]args){  
//REFRENCE DATA TYPES
String mynames = "nwayitelo mahlori";// first way of declaring (simple way)
  String mynames1 = new String("nhluvuko makhubele");
  
 mynames.toUpperCase();
 mynames.trim();
 String mycapsname = mynames.toUpperCase();
  System.out.println(mynames.toUpperCase());
    System.out.println(mycapsname);
 
    mynames1.length();
     int mylenght = mynames1.length();
    System.out.println(mynames1.length());
   System.out.println(mylenght);
    
//DATE IS ANOTHER EXAMPLE OF THE REFERENCE DATA TYPE  
   Date dd = new Date();
  dd.toString();
 System.out.println(dd.toString());
 
 LocalDateTime dt;
 System.out.println(dd);
  System.out.println(LocalDateTime.of(2022, Month.DECEMBER, 06, 12, 36).toString());
  System.out.println(LocalDate.now());
  System.out.println(LocalTime.now());
  System.out.println(LocalDateTime.of(2022,12, 06, 12, 37));
  
  StringBuilder sd = new StringBuilder ("mahlori nwayitelo");
  //sd.insert(7, "telow");
  System.out.println(sd.insert(7, "telow"));
  
  
  
  }
  
}