package javaprogramming;

import java.util.ArrayList;

public class ArrayListEX7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer>ar1=new ArrayList<Integer>();
		ArrayList<Integer>ar2=new ArrayList<Integer>();
		
	//for ar1	
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
	System.out.println("for ar2"+ar1);
		
	//for ar2	
		ar2.add(60);
		ar2.add(70);
		ar2.add(80);
		ar2.add(90);
		ar2.add(100);
		System.out.println("for ar1"+ar2);
		
		ar1.addAll(ar2);
		
		
		System.out.println("new array"+ar1);
		
		
		
	}

}
