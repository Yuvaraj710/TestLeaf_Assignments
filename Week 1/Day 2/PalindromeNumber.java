package week1.day2.assignment;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 151, rev=0, rem=0;
		int temp = number;
		
		while(number!=0) 
		{
		rem = number%10;
		rev = rev * 10 + rem;
		number = number/10;
		}
		
		if (rev==temp) {
			System.out.println(" its a Palindrome Number");
		}
		else {
			System.out.println("This is not Palindrome");
		}

	}

}
