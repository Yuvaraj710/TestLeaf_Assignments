package week1.day2.assignment;

public class NegativeToPositive {
	
	public static void main(String[] args) {
		int number = -40;
		int output=1;
		if (number>0)
		{
			System.out.println(number+ " is a Positive Number");
		}
		else if(number<0)
		{
			output = -1*number;
			System.out.println("The given Number : "+number);
			System.out.println(output +" the Negative Number is converted to Positive");
		}
		else 
		{
			System.out.println("The number entered is invalid");
		}
	}

}
