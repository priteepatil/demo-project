package javaprogramming;

import java.util.HashSet;

public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashSet<Object>h1=new HashSet<Object>();
		h1.add("Pune");
		h1.add("Mumbai");
		h1.add(Integer.valueOf(10));
		h1.add(null);
		h1.add(55.44);
		h1.add("KN");
		h1.add(null);
		h1.add(true);
		System.out.println("h1:"+h1);
		
		
	}

}
