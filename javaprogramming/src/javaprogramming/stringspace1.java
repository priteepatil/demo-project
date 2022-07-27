package javaprogramming;



public class stringspace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			
			
	String str1="remove all white space";
		//str1=str1.replaceAll("\s+","");
		
		int n=str1.length();
		
		
	str1=str1.replaceAll("\s","");
	System.out.println("string after removing white spaces   "+ str1);
	
	
	
	}

}
