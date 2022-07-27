package javaprogramming;

import java.util.Arrays;

public class arraycompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr1[]= {9,8,7,6,5,3,1,2};
	int arr2[]= {10,8,7,6,5,9,1,2};
	
	int []arr3= {5,3,2}; //different ways declare array
	
	int arr4[]=new int[]{1,2,3};
	System.out.println(Arrays.equals(arr1, arr2)); //for comparing two array
	System.out.println(arr4);
	
	for(int i: arr4)
	{
		System.out.println(arr4);
	}
	}

}
