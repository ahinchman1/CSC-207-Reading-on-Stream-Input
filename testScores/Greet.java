package testScores;

import java.util.Scanner;

public class Greet
{

  public static void main (String args[])
  {   
    // use System.in to initialize scanner
    Scanner fileIn = new Scanner (System.in);

    System.out.print("What is your name? ");
    //read entire line
    String name = fileIn.nextLine();
    System.out.println("Have a nice day " + name+ "!");
  }//main (String[])
}//class Greet
