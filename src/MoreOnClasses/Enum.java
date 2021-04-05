package MoreOnClasses;

public class Enum {

    enum Color {
      RED, BLUE, GREEN;
    }
 public void PrintColor() {}
     public void main(String[] args) {
       Color color = Color.RED;
       switch(color) {
         case BLUE:
           System.out.println("1");
           break;
         case GREEN:
           System.out.println("2");
           break;
         default :
           System.out.println("0");
           break;
        }
      }
    }
  


