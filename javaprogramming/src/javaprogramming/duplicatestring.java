package javaprogramming;

public class duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//duplicate char in the string		
		
		
		
		String str="pritee";

int n=str.length();

//System.out.println(n);


for(int i=0;i<n;i++)
{
	
	
	
	if(str.charAt(i)==str.charAt(i+1))
	{
		System.out.println("dupliacte char  "+str.charAt(i));
	
	
	break;
	
	}


	else
	{
		System.out.println("no duplicate char  " +str.charAt(i));
	}






}
	
	
	
	
	
	
	
	
	
	
	}



	
	
	
	
	

}
