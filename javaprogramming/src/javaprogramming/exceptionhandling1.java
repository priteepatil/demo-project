package javaprogramming;

public class exceptionhandling1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	try
	{
		int a=10/0;
		
	}
		
//	catch(Exception e)	
//	{
//		System.out.println(e);
//	}
//	
	catch(ArithmeticException e1)
	{
		System.out.println(e1);
	}
	
	
	
	
	catch(Exception e)	
	{
		System.out.println(e);
	}
	
	
finally	
{
	System.out.println("a value should execucate");
}
	
	
	}

}
