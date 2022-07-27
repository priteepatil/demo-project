/**
 * 
 */
package javaprogramming;

import java.util.Scanner;

/**
 * this is input method programme in which scanner class in bulit class which already defined in util.scanner 
 *
 */
public class inputmethod {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a,b;
	
	Scanner scan=new Scanner(System.in);//
	

	
	System.out.println("please enter value of a");
	a=scan.nextInt();//next int () used to read next value of interger by user

	
	System.out.println("please enter the value of b");
	
	b=scan.nextInt();
	
	
	
	int c=a+b;
	System.out.println("addition of two numbers"+c);
	
	
	
	
	
	}

}
