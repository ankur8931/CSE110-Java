/*-------------------------------------------------------------------------

// AUTHOR: Ankur Chowdhary

// FILENAME: title of the source file

// SPECIFICATION: description of the program

// FOR: CSE 110- Lab #1

// TIME SPENT: how long it took you to complete the assignment

//-----------------------------------------------------------*/

import java.util.*;

public class Lab1 {

  public static void main(String args[]){

   /*Declare the variables to get test scores */
   int test1, test2, test3;

   /* Decalre constant to accept the number of tests */
   final int NUM_TESTS = 3;

   /*Declare the variable average to store average of three tests */
   double average = 0.0;

   /*Declare scanner variable to get system input */
   Scanner in = new Scanner(System.in);

   /*Accept the marks of three tests */
   System.out.print("Enter the score on the first test: "); // prompt
   test1 = in.nextInt(); // read in the next integer

   System.out.print("Enter the score on the second test: "); // prompt
   test2 = in.nextInt(); // read in the next integer

   System.out.print("Enter the score on the third test: "); // prompt
   test3 = in.nextInt(); // read in the next integer

   /*Calculate the average */
   average = (test1 + test2 + test3) / (double)NUM_TESTS;

   /*Display the average marks */
   System.out.print("Your average score is:"+average); // prompt

   /*Close the scanner class object*/
   in.close();
  }

}