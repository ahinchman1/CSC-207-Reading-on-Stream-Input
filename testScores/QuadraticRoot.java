package testScores;

import java.lang.Math;
import java.util.Scanner;
import java.io.IOException;
import java.lang.ArithmeticException;


/* Program to read 3 numbers from keyboard, and compute the small quadratic
   root */
public class QuadraticRoot
{
  public static double smallQuadraticRoot(double a, double b, double c) 
  throws Exception
  	 {

  	if (a == 0 || b == 0 || c==0)
  		throw new ArithmeticException();


	double det = (b*b)-(4*a*c);


  	if (det >= 0) // i.e. "if roots are real"
  		 return ( (-b  - Math.sqrt(det) )/ (2*a));
  	else
  		throw new Exception("Imaginary roots");
  		}
   
  

  public static void main (String args []) throws Exception {
 // use FileReader object to initialize scanner
		Scanner fileIn = new Scanner (System.in);

		System.out.println("Enter 3 numbers");
		double root1 = fileIn.nextDouble();
		double root2 = fileIn.nextDouble();
		double root3 = fileIn.nextDouble();
		QuadraticRoot r = new QuadraticRoot();

	try 
	{
  		double root = smallQuadraticRoot(root1, root2, root3);
  		System.out.println("The smaller root of the polynomial is: " + root);
	}
	catch (ArithmeticException arithE) 
    {
      System.err.print
      ("Cannot compute a result because the coefficient of the quadratic ");
      System.err.println ("term is 0.");
    }   
    catch (Exception e) 
	{
  		System.err.println("Sorry, I could not compute a root.");
  		System.err.println("Error reported: " + e);
	}	

  }
}
