package MoreOnClasses;

public class Inheritance {
   public void makeSound() {
     System.out.println("Hi");
  }
  public class Dog extends Inheritance {
  }
  
  class A {
  public void main(String[] args){
    Dog dog = new Dog();
    dog.makeSound();
    }
  }
}
