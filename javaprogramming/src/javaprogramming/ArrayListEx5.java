package javaprogramming;

import java.util.ArrayList;

public class ArrayListEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
ArrayList<String>ar1=new ArrayList<String>();

	
ar1.add("Pune");
ar1.add("Mumbai");
ar1.add("USA");
ar1.add("SA");
ar1.add(null);
ar1.add("Pune");

ar1.add(null);
ar1.add("Mumbai");
ar1.add("UK");
ar1.add("Japan");
ar1.add("Nasik");
System.out.println(ar1);

System.out.println("size"+ar1.size());

//adding
ar1.add(4,"china");

System.out.println(ar1);
System.out.println("size"+ar1.size());



//update
ar1.set(5, "Nagpur");
System.out.println(ar1);
System.out.println("size"+ar1.size());


	
	}

}
