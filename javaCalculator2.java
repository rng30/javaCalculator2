package javaCalculator2;

import java.util.Scanner;

public class javaCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1;
		double n2;
		String operation;
		
		Scanner in = new Scanner(System.in);  // Reading from System.in
		
		System.out.println("Enter a number: ");
		n1 = in.nextDouble(); // Scans the next token of the input as an int.
		
		System.out.println("Enter a second number: ");
		n2 = in.nextDouble();
		
		Scanner op = new Scanner(System.in);

	      System.out.println("Please enter operation");
	      operation = op.next();

	      if (operation.equals("+")) {
	          System.out.println("your answer is " + (n1 + n2));
	      }
	      
	      if  (operation.equals("-")) {
	          System.out.println("your answer is " + (n1 - n2));
	      }
	      
	      if (operation.equals("/")) {
	          System.out.println("your answer is " + (n1 / n2));
          }
	      
	      if (operation.equals("*")) {
	          System.out.println("your answer is " + (n1 * n2));
	      }
	}
}

