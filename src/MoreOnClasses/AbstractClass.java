package MoreOnClasses;

abstract class AbstractClass {
     public int age;
   public abstract int printAge();
   }
   class Dog extends AbstractClass {
   public int printAge() {
   return age;
   }
}
