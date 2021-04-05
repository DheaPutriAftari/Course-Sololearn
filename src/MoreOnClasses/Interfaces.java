package MoreOnClasses;

public class Interfaces {
    interface Animals {
      public void eat();
    }
    class Cat implements Animals {
      public void eat() {
        System.out.println("Cat eats");
    }
  }
}
