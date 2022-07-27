package javaprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayprogramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int arr[]= {1,2,10,4,9};
	
	for (int i :arr)
	{
		System.out.println(i);
	}
	
	
int a=arr[0];
int b=arr[1];
int c=arr[2];
	
int d=arr[3];
int e=arr[4];


int F=a+b+c+d+e;
System.out.println(F);
	
	
	System.out.println(arr.length);
	System.out.println(arr.toString());
	
	System.out.println("before sorting");	
System.out.println(Arrays.toString(arr)); //to print an array in single line
	
	//sorting array

	Arrays.sort(arr);
	System.out.println("after sorting ");
	
	System.out.println(Arrays.toString(arr));
	
	
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	
	for(int j=4;j>=0;j--)
	
	{
		
		System.out.println(arr[j]);
		
	}
	Arrays.sort(arr);//by default ascending sort
	
	System.out.println(Arrays.toString(arr));
	
	
	}





}
