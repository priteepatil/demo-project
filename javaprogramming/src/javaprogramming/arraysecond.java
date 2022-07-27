package javaprogramming;

import java.util.Arrays;

public class arraysecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,4,9,15,30};

int n=arr.length;
System.out.println(n);

Arrays.sort(arr);
System.out.println(Arrays.toString(arr));


System.out.println("second highest "+arr[n-2]);

System.out.println(" highest "+arr[n-1]);
	
	
	
	
	}

}
