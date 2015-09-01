//***********************************************************
//Name: Ankur Chowdhary
//Title: Assignment1.java
//Description: Description of the program
//Time spent: 30 minutes
//Date: 8/15/2015
// Part 1
//1: myString.length()
//2: System.out.println("Enter your age:");
//		 int age = sc.nextInt();
//3: Hy
//**************************************************************



import java.util.Scanner;


public class Assignment1 {

	 public static void main(String args[]){
		
		 //Declare variable name, height in inches(Hi) and feet (Hf)
		 String name;
		 int Hf,Hi;
		 //Height in meters is declared as double
		 double Hm;
		 
		 Scanner sc = new Scanner(System.in);
		 //Accept name of the user
		 System.out.print("What is your name ?");
		 name = sc.next();
		 
		 //Accept user height in feet and inches
		 System.out.println("What is your height?");
		 System.out.print("Feet:");
		 Hf = sc.nextInt();
		 		
		 System.out.print("Inches:");
		 Hi = sc.nextInt();

		 
		 //Formula to convert height from feet and inches to meters
		 Hm = ((Hf * 12) + Hi) * 2.54 / 100;
		 
		 //Display user height in meters
		 System.out.println(""+name+", your height in meters is "+Hm);
		 
		
	 }
}
