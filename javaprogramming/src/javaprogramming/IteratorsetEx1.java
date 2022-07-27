package javaprogramming;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorsetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HashSet<String>h1=new HashSet<String>();

h1.add("Pune");
h1.add("Mumbai");
h1.add("USA");
h1.add("Japan");
h1.add("Nasik");
System.out.println("h1"+h1);
Iterator<String>itr=h1.iterator();
String str="";
while(itr.hasNext())
{
	str=itr.next();
	System.out.println(str);
	if(str.equals("Pune"))
	{
		System.out.println("good Morning");
		break;
	}
}

	
	
	
	
	}

}
