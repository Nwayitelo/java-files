/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAINING2
 */ 

class Car {
  public void carSound() {
    System.out.println("The cars move fast");
  }
}

class BMW  extends Car{
  public void carSound() {
    System.out.println("Bmw sound : says yoongg");
  }
}

class Ranger extends Car {
  public void carSound() {
    System.out.println("Ranger sound : says mhmmm");
  }
}

class Main {
  public static void main(String[] args) {
    Car mycar = new Car();
  Car BMW = new Ranger ();
    Car Ranger = new Ranger();
        
    mycar.carSound();
    mycar.carSound();
    Ranger.carSound();
  }
}