package javaprogramming;

import java.util.ArrayList;
import java.util.ListIterator;

public class SetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>ar=new ArrayList<String>();


ar.add("Pune");
ar.add("Mumbai");
ar.add("USA");
ar.add("Japan");
ar.add("Nasik");

System.out.println("ar"+ar);
ListIterator<String>itr=ar.listIterator();
System.out.println(itr.hasPrevious());
System.out.println(itr.hasNext());
System.out.println(itr.hasPrevious());
System.out.println(itr.previous());

	}

}
