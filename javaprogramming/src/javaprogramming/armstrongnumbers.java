package javaprogramming;

public class armstrongnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int n=153;
	int r1=n%10;
	
	r1=r1*r1*r1;
	
	//System.out.println(r1);
	
	
	int n1=n/10;
	
	int r2=n1%10;
	 r2=r2*r2*r2;
	 
	// System.out.println(r2)	;	
	 
	 int n2=n1/10;
	 int r3=n2%10;
	 
	 r3=r3*r3*r3;
	 
	// System.out.println(r3);
	 
	 
	 int r=r1+r2+r3;
	// System.out.println("armstrong "+r);
	 
	 if(r==153)
	 {
		 System.out.println("armstrong "+r);
		 
	 }
	 
	 else
	 {
		 System.out.println("not armstrong");
	 }
			
			
	
	
	}

}
