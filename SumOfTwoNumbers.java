/* Program to calculate sum of two numbers without using + operator, other operators can be used*/

import java.util.Scanner; //Importing Java.Util package to use the Scanner class to input values from console

/*Declaring the main class*/
public class SumOfTwoNumbers {	
/*  Defining the main method. First line of the execution of the code */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //Creating scan reference object of class Scanner to provide input at run time.
		System.out.println("Enter First Integer Value");//Input Message through console
		int i = scan.nextInt();
		System.out.println("Enter Next Integer Value");//Input message through console
		int j = scan.nextInt();
		int sum = i -(-j);	//Using minus (-) operator to sum the two values given from output console. As other operators can be used, so used minus operator.	
		System.out.println("Sum of two numbers is: " + sum);//Final output statement
	}

}
