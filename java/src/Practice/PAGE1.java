/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author TRAINING2
 */
public class PAGE1 {
 public void animalSound(){   
}
}
class Dog extends PAGE1{
    public void animalSound(){
        System.out.println( "my dog : barks");
    }
}
class Elphant extends PAGE1{
public void animalSound(){
System.out.println("my elephant: woows");
}
}
 
class main{
public  static void main (String[]args){
 PAGE1 myanimal = new PAGE1();
 PAGE1 Dog = new Dog();
PAGE1 Elphant = new Elphant();

myanimal.animalSound();
Dog.animalSound();
Elphant.animalSound();
}
 }