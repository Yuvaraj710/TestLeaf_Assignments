package week1.day2.assignment;

import java.util.Arrays;


public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		System.out.print("The Sorted Array is : ");
		
		for(int i=0; i<data.length ; i++)
		{
			 System.out.print(data[i] + " ");
		}
		
		System.out.println("\n\nThe Second Largest No:" + data[data.length-2]);
		
	

	}

}
