package javaprogramming;

import java.util.Scanner;

public class armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arm=0,a,d,n;

Scanner s=new Scanner(System.in);
System.out.println("enter any num");

n=s.nextInt();

d=n;


while(n>0)
{
	a=n%10;
	
	n=n/10;
	
	
	arm=arm+a*a*a;
}
	
	
	if(arm==d)
	{
		System.out.println("armstrong");
	}
	
	else
	{
		System.out.println("not armstrong");
	}
	
	
	}

}
