package Arrays;

import java.util.Scanner;
public class ReverseAStringProject3 {

  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here

		char[] result = new char[arr.length];

		//store the result in reverse order into the result char[]

		for(int i=0; i<arr.length; i++)
		{
			result[i] = arr[arr.length - i - 1];
		}

		System.out.println(new String(result));
  }

}
