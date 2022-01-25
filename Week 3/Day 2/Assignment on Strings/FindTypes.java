package week3.day2.assignment;

//Build the logic to find the count of each

/* Pseudo Code:
	a) Convert the String to character array
	b) Traverse through each character (using loop)
	c) Find if the given character is what type using (if)
			i)  Character.isLetter
			ii) Character.isDigit
			iii)Character.isSpaceChar
			iv) else -> consider as special character
*/

public class FindTypes {

	public static void main(String[] args) {
		
		String s = "yuvaraj@7 ";

		int l = 0, d = 0, sp = 0, space = 0;

		char[] str = s.toCharArray();

		for (int i = 0; i < s.length(); i++) 
		{
			if (Character.isLetter(str[i])) 
			{
				l++;
			} 
			else if (Character.isDigit(str[i])) 
			{
				d++;
			} 
			else if (Character.isSpaceChar(str[i])) 
			{
				space++;
			} 
			else 
			{
				sp++;
			}

		}

		System.out.println("The letter count in the String is : " + l);
		System.out.println("The digit count in the String is : " + d);
		System.out.println("The space count in the String is : " + space);
		System.out.println("The special char count in the String is : " + sp);

		}
}
