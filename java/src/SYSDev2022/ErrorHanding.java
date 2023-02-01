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
public class ErrorHanding {
//run error handing - using ArithmeticException
    public static void main (String[] args) {
    try{
int x = 20 ; 
int y = 0 ;
int z = x/y ;
System.out.println(z);
    }catch(ArithmeticException e){
System.out.println("Dividing by zero is not allowed ");
    }   
}
}