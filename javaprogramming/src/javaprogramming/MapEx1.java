package javaprogramming;

import java.util.HashMap;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String>m1=new HashMap<Integer,String>();
		
		m1.put(50, "Akshay Kumar");
		m1.put(10, "pritee patil");
		m1.put(99, "Aditya Jagdhane");
		m1.put(-70, "Varsha gargade");
		
		
		System.out.println("m1:"+m1);
		
		System.out.println(m1.get(10));
		System.out.println(m1.get(null));
	}

}
