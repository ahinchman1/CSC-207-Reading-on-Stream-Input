package streamInput;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Program to read numbers from the keyboard using the Buffered Reader Class 
 * until the user types 0 and then return the sum of all numbers entered.
 */
public class AddBuff {

	public static void main (String args []) throws Exception{

		/* set up buffered reader */
		InputStreamReader istream = new InputStreamReader (System.in);
		BufferedReader fileIn = new BufferedReader(istream);

		System.out.print("Please enter numbers to be summed, and ");
		System.out.println("enter zero when you want the sum");
		
		int num;
		int sum= 0;
		while ( (num = Integer.parseInt(fileIn.readLine())) != 0)
		{
			sum += num;
		}
	
		System.out.println("The sum of the numbers is: " +sum);
	}
}
