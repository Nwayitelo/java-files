/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAINING2
 */
public class Thursday {
 public static void main(String[] args){   
 Thursday bb= new Thursday();
 bb.product();
 Thursday.Display();
 }
public void product()
{
int a = 11;
int b = 20;

 double c = (double) b/a;
System.out.println(c);
}
public static void Display()
{

String Fname = "john";
String Lname = "pule";
String Fullname =  Fname+" "  + " " + Lname ;
System.out.println(Fullname);
}
}
