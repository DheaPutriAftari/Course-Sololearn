package MoreOnClasses;

public class MethodOverloading {
   public void doSomething() {
     System.out.println("A");
   }
   public void doSomething(String str) {
     System.out.println(str);
   }
}
class B {
  public static void main(String[] args) {
  MethodOverloading object = new MethodOverloading();
  object.doSomething("B");
  }

}
