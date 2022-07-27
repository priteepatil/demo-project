package javaprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer>ar1=new ArrayList<Integer>();
	
	ar1.add(5);
	ar1.add(12);
	ar1.add(-7);
	ar1.add(20);
	ar1.add(80);
	ar1.add(50);
	ar1.add(-2);
	ar1.add(7);
	
	
	System.out.println("ar1" +ar1);

	System.out.println("ar1 " +ar1.size());
	
	System.out.println("***************");
	Collections.sort(ar1);
	
	System.out.println("ar1" +ar1 );
	System.out.println("***************");
	Collections.reverse(ar1);
	System.out.println("ar1" +ar1);
	
	System.out.println("***************");
	
	
	
	
	
	ar1.remove(2);
	System.out.println("ar1" +ar1);
	System.out.println("ar1 " +ar1.size());
	ar1.remove(new Integer(3));
	System.out.println("ar1" +ar1);
	System.out.println("ar1 " +ar1.size());
	ar1.removeAll(ar1);
	System.out.println("ar1" +ar1);
  System.out.println("***************");
	ar1.retainAll(ar1);
System.out.println("ar1" +ar1);
//	System.out.println("***************");
	}

}
