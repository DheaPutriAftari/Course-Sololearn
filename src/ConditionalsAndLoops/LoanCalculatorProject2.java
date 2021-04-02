package ConditionalsAndLoops;

import java.util.Scanner;
public class LoanCalculatorProject2 {

  public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		
		//your code goes here
   	for (int month = 1; month <=3; month = month + 1){
 
      amount= (int)amount - (int)Math.ceil(0.1 * amount);
   }
      System.out.println(amount);
	  
    }

}
