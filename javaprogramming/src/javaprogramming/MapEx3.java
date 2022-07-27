package javaprogramming;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String>m1=new HashMap<Integer,String>();
		m1.put(50, "pritee patil");
		m1.put(60, "AdityaJagdhane");
		m1.put(70, "Varsha gargade");
		m1.put(-99, "Bhnudas patil");
		m1.put(0,"Priya patil");
		System.out.println("m1" +m1);
		System.out.println("50:"+m1.get(50));
		Set<Integer>s1=m1.keySet();
		System.out.println("s1"+s1);
		//System.out.println("s1"+s1)
		
		
		Collection<String>c1=m1.values();
		System.out.println("c1" +c1);
		
		
		
	}

}
