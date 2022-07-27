package javaprogramming;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a=10;
	
	System.out.println(a);
	double tc=a;
	System.out.println(tc);
	
	//narrowing
	
	double d1=10.5;
	System.out.println(d1);
	
	int b=(int)d1;
	System.out.println(b);
	
	//assignment convert the char into long and verify the result
	//convert long into char and verify the result
	
	
//convert char into int	
	
	char f='b';
	
	System.out.println(f);
	
	long V=Character.getNumericValue(f);
	System.out.println(V);
	
//int x=Character.getNumericValue(f);
//
//System.out.println(x);
//
//long l=x;
//
//System.out.println(l);
	
	
	
	//convert long into char
	


Long i=9993939399L;

//char c1=(char)i;
String s=Long.toString(i);

System.out.println("long to string"+s);




	
	
		
		
	}

}
