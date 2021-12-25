package week1.day1.assignment;


public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	  
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	  
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 
	 * What are my learnings from this code? 
	 * 1)how to write a code for fibonacci series
	 */

	public static void main(String[] args) {
		
		int range = 8, firstNum = 0, secNum = 1, sum=0;
		// initializing the variables
		System.out.println(firstNum);
		System.out.println(secNum);
		// Printed first two numbers
		
		for(int i=1; i<range; i++)
			// Iterate from 1 to the range
		{
			sum = firstNum + secNum ; 
			// add first and second number assign to sum
			firstNum = secNum;
			// Assign second number to the first number
			secNum = sum;
			// Assign sum to the second number
			System.out.println(sum);
			// print sum
		}

	}

}
