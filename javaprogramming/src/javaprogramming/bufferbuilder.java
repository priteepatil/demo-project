package javaprogramming;

public class bufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer buffer=new StringBuffer("Hello Data");
StringBuilder builder =new StringBuilder("Test Word");
System.out.println(buffer);
System.out.println(builder);


//for reverse string
System.out.println(buffer.reverse());
System.out.println(builder.reverse());
//string concat operation
buffer.append("pritee");

System.out.println(buffer.reverse());


//for comparing string
int a=builder.compareTo(builder);
System.out.println(a);


//to know the capacity
int b=builder.capacity();
System.out.println(b);
int c=buffer.capacity();
System.out.println(c);

//

//for delete the string

buffer.delete(0, 6);

System.out.println(buffer);

//replace
StringBuffer Buf=new StringBuffer("This is test data");
System.out.println("buf");
Buf.replace(8, 12, "my");
System.out.println(Buf);



















	
	}

}
