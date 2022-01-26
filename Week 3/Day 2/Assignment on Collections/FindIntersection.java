package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {

		/* Find and print same value in two Arrays using Collection Concept */ 
	
		public static void main(String[] args) {
			Integer[] arr1 = {3,2,11,4,6,7};
			Integer[] arr2 = {1,2,8,4,9,7};
			
			List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));
			List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr2));
			
			System.out.println("First Array  : "+list1);
			System.out.println("Second Array : "+list2+"\n");
			
			Set<Integer> set1 = new TreeSet<Integer>();
			set1.addAll(list1);
			set1.addAll(list2);
			
			System.out.println("After combining both arrays without duplicates : ");
			System.out.println(set1+"\n");
			
			list1.retainAll(list2);
			
			System.out.println("The inter section values of both arrays: ");
			System.out.println(list1);

	}

}
