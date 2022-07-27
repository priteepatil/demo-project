package javaprogramming;

import java.util.Scanner;
//write java program to check if string has all unique character
public class string2 {

	 static boolean isUnique(String str)
	{
		
		
		
		if (str.length()>128)
		{
			return false;
		}
		boolean[] charcheck=new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			
		int val=str.charAt(i);	
			
			if(charcheck[val])
			{
				return false;
			}
		charcheck[val]=true;
		}
		return true;
		
		
		}
	public static void main(String[] args) {
		
	System.out.println("enter the string");
	
	
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	System.out.println(isUnique(s1));
	}
	
}
	
	
	
	

