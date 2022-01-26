package week3.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	/* Remove Duplicates words from the Given Sting Using Collection Concept */

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] word = text.split(" ");
		
		Set<String> duplicate = new LinkedHashSet<String>();
		
		for (String string : word) 
		{
			duplicate.add(string);	
		}
	
		String output = String.join(" ", duplicate);
		
		System.out.println("Before : " +text);
		System.out.println("After  : "+output);
		
	}
	
}