package week3.day2.assignment;

public class CharOccurance {

	/* Check number of occurrences of a char (eg 'e') in a String

		declare and initialize a variable count to store the number of occurrences

		convert the string into char array
		
		get the length of the array

		traverse from 0 till the array length

	 	Check the char array has the particular char in it

		if is has increment the count

		print the count out of the loop
	
	*/

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char check = 'c';
		int count = 0;

		char[] array = str.toCharArray();

		for (int i = 0; i < str.length() - 1; i++) {
			if (array[i] == check)
				count++;
		}

		System.out.println("The character '" + check + "' appears " + count + " times in the sentence");

	}

}
