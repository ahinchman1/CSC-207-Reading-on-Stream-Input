package testScores;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GreetBuff 
{
  public static void main (String args[]) throws Exception
  {
    
      InputStreamReader istream = new InputStreamReader (System.in);
     // use FileReader object to initialize scanner
    BufferedReader fileIn = new BufferedReader (istream);

    System.out.print("What is your name? ");
    //read entire line
    String name = fileIn.readLine();
    System.out.println("Have a nice day " + name+ "!");


  }// main (String[])
}// GreetBuff
