package week1.day2.assignment;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	// get the length of the array
	// declare an int variable named count
	// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count

	// iterate from i to the length of the array by adding 1 to it (inner loop
	// starts here)

	// compare both the loop variables & check they're equal

	// increase the count if both the arrays are equal

	// Out of the inner loop, check and print the first array variable if count is
	// more than 0

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,17,12,13,16,18,19,17,20};
		
		int count=0;
		
		Arrays.sort(arr);
		
		System.out.print("The Sorted Array is : ");
		
		for(int i=0; i<arr.length ; i++)
		{
			 System.out.print(arr[i] + " ");
		}
		
		System.out.print("\n\nThe Duplicate Elements in the Array is : ");
		for(int i=0; i < arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length-1; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[j] + " ");
					count++;
				}
			}
		} 
		
		if(count ==0) 
		{
			System.out.println("\n\nTha Array has no duplicated Elements. ");
		}
		else 
		{
			System.out.println("\n\nThe Repeated Elements in the Array is: " + count);
			
		}
		
	}

}
