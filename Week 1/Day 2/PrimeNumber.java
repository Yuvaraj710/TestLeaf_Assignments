package week1.day2.assignment;

public class PrimeNumber {

	// Declare an int Input and assign a value 13

	// Declare a boolean variable flag as false

	// Iterate from 2 to half of the input

	// Divide the input with each for loop variable and check the remainder

	// Set the flag as true when there is no remainder

	// break the iterator

	// Check the flag (Provide a condition)

	// Print 'Prime' when the condition matches

	// Print 'Not a Prime' when the condition doesn't match

	public static void main(String[] args) {
		int input = 25;
		boolean flag = false;
		
		for(int i=2; i<input ; i++)
		{
			if(input%i == 0)
			{
				System.out.println("The Given Input No  : " + input);
				flag = true;
				System.out.println("The input is Divisible By : " + i);
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("The Given Number " + input + " is not a prime Number.");
		}
		else
			System.out.println("The Given Number " + input + " is a prime Number.");
		
		}

}
