package javaprogramming;

import java.util.Scanner;

public class primeno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n ;
	int count=0;
	System.out.println("enter any number ");
	Scanner ref=new Scanner(System.in);
	n=ref.nextInt();
	
	
	
	
	
	for (int i=1;i<=n;i++)
	
	{
		if(n%i==0)
		{
		
		
		count++;
	
		}
		}
	
	if (count==2)
	{
		System.out.println("prime number");
		
	}
	else
	{
		System.out.println("not prime numeber");
	}
	
	}

	}


