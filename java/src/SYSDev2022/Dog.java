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
public class Dog extends ANIMALS.java{
 String Sound = "bark";
boolean hasWiskers = true ;
boolean hasPours = true;
String family = "canidae";   

public static void main(String[]args){
Dog dd = new Dog();
System.out.println(dd.hasWiskers + " "  + dd.hasPours  + " " + dd.family);
}
