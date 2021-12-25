package week1.day1.assignment;

public class OddNumber {
	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 
	 * Input: range of numbers (starting to end) [1 to 20]
	 * Output: Printing only odd numbers [1,3,5,7,9...,19]
	 * 
	 * Shortcuts:
	 * 1) Print : type 'syso', followed by ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	  
	 * What are my learnings from this code?
	 * 
	 * 1)Learned how modulo operator works
	 * 2)Learned how for loop works
	 * 3)Learned how to print odd numbers
	 */


	public static void main(String[] args) {
		
		System.out.println("Printing the odd numbers from 1 to 20");
		for (int i=1; i<=20; i++)	
			//Iterate from 1 to 20 (tip: using loop concept)
		{
			if(i % 2 == 1)
				//check whether the integer is odd 
			{
				System.out.println(i);
					//print the odd integer
			}
		}

	}

}
