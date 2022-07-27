package javaprogramming;

import java.util.ArrayList;

public class ArrayListex4 {

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
	
	System.out.println("size:" +ar1.size());
	for(int i=0;i<ar1.size();i++)
	{
		if(ar1.get(i)==null)
		{
			continue;
		}
		//System.out.println(ar1.get(i));
	
	if(ar1.get(i).equals("UK"))
	{
		break;
	}
	
System.out.println(ar1.get(i));
	
	
	}
			
	
	
		
		
		
	}

}
