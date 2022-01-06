package week1.day1.assignment;

public class Factorial {
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	  
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 
	 * What are my learnings from this code?
	 * 1)learned how for loop is working
	 * 2)learned how to write a code to print factorial of a number
	 */

	public static void main(String[] args) {
		
		int input =5;
		// Declared input as 5
		int fact =1;
		// Declared integer variable fact as 1
		for(int i=1;i<=input;i++) 
		// Iterating from 1 to input	
		{
			fact = fact * i;
			// Multiply fact with the iterator variable 
		}
		System.out.println(fact);
		// Print factorial (fact)
		
		}

	}
