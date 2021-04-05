package ExceptionsListsThreadsAndFiles;

public class Threads {
    class A extends Threads {
      public void run() {
        System.out.println("Hello");
      
    }
  public void main(String[] args) {
  A object = new A();
  object.run();
     }
   }

}
