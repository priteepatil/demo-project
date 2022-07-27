package javaprogramming;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar1=new ArrayList();
		ar1.add(10);
		ar1.add(new Integer(500));
		ar1.add(new Byte((byte)100));
		ar1.add("pune");
		ar1.add(new String("mumbai"));
		
		ar1.add(new ArrayListEx1());
		
		ar1.add(88.77);
		
		System.out.println("ar1="+ar1);
		
	}

}
