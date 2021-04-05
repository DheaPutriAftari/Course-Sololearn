package MoreOnClasses;

public class DownCasting {
    public void print() {
      System.out.println("A");
    }
class B extends DownCasting {
    public void print() {
      System.out.println("B");
    }
  public void main(String[] args) {
    DownCasting object = new B();
    B b = (B) object;
    b.print();
     
     }
   }
}
