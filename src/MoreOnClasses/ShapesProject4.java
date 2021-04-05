package MoreOnClasses;

import java.util.Scanner;
public class ShapesProject4 {

abstract class Shape {
    int width;
    abstract void area();
    double k = Math.PI;
    int width1;
    double width2;
 
   }
//your code goes here

  class Square extends Shape{

     public Square (int width){
	
	this.width = width;
    }
     void area (){
      int width1= (width*width);
        System.out.println (width1);
    }
	
}

      class Circle extends Shape{
   public Circle (int width){
	  this.width = width;
}

    void area(){
	   double width2 = ((k)*width*width);
       	System.out.println (width2);

    }
	
}

public class Program {
    public void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
      }
   }
}
