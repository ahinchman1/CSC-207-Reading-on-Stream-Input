package streamInput;

import java.util.Scanner; 

/* Program to read numbers from the keyboard until the user types 0
 * and then return the sum of all numbers entered.
 */
public class Add {

	public static void main (String args []) {
		
		 // use FileReader object to initialize scanner
		Scanner fileIn = new Scanner (System.in);
		
		System.out.print("Please enter numbers to be summed, and ");
		System.out.println("enter zero when you want the sum");
		
		int num;
		int sum= 0;
		while ((num = fileIn.nextInt()) != 0)
		{
			sum += num;
		}
	
		System.out.println("The sum of the numbers is: " +sum);
	}
}
