package javaprogramming;

import java.util.HashSet;

public class SetEx2 {

	public static void main(String[] args) {

	// TODO Auto-generated method stub
		
		HashSet<String>h1=new HashSet<String>();

	System.out.println("is empty  " +h1.isEmpty());
	h1.add("pune");
	h1.add("mumbai");
	h1.add("USA");
	h1.add("UK");
	h1.add("JAPAN");
	h1.add("Nasik");
	h1.add("NAgpur");
	System.out.println("h1:"+h1);
	
	System.out.println("size"+h1.size());
	
	for(String str:h1)
	{
		System.out.println(str);
	}
	
	System.out.println("is empty  " +h1.isEmpty());
	
	if(!h1.isEmpty())
	{
		
		
		
		if(h1.contains("JAPAN"))
		{
			h1.remove("JAPAN");
		}
	
		else
		{
			System.out.println("Hashset is empty");
		}
	
	System.out.println("h1:"+h1);
	
	}
		
		
		
		
		
	}

}
