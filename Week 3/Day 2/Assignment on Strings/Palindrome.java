package week3.day2.assignment;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
   	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

	public static void main(String[] args) {
		
		String str1 = "madam";
		String rev = "";
		
		int length = str1.length();
		
		System.out.println("The Given String : " +str1);
		
		for(int i=length-1; i>=0 ; i--)
		{
			rev = rev + str1.charAt(i);
		}
		
		System.out.println("The Reversed String : " +rev);
		
		if(str1.equals(rev))
		{
			System.out.println("The given String is a Polindrome ");
		}
		else
			System.out.println("The given String is not a polindrome");
		
		}

}
