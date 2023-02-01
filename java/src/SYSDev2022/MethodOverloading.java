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

public class MethodOverloading {
    public void display(){
System.out.println("welcome to java class");
      
    
    }
public static void main(String[]args){
   MethodOverloading bb = new   MethodOverloading();
   bb.display();
bb.calculate();
System.out.println(bb.calculate());
}
  
    public int calculate ()
        {
     int a  =2 ;
     int b = 3;
     int c = a * b;
        return c;
        }
}

public float Add(float a , float b, float c ){


{
}
}




















//method overload
/*public class MethodOverloading {
static  int addMethodInt(int x, int y){
return x + y;    
}

static double addMethodDouble  (double  x, double y ){
return x + y;
}
public static void main(String[]args){
    int myNum1 = addMethodInt(8,5);
    double myNum2 = addMethodDouble(4.3 , 6.26);
    System.out.println("int:" + myNum1);
 System.out.println("double: "+ myNum2);

}
}

//method overriding
class college {
 public void move() {
  System.out.println("College is open");
 }
}
class univ extends college {
 public void move() {
  System.out.println("University is open too");
 }
}
 
 

 class main {
 public static void main(String args[]) {
  college a = new college();
  college b = new univ();
  a.move();
  b.move();
 }
}
 */
