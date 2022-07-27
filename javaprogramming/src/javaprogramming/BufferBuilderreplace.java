package javaprogramming;

public class BufferBuilderreplace {
	
	
	public static void main(String[] args) {


StringBuffer bu=new StringBuffer("This is test data");
StringBuilder bui=new StringBuilder("Ths is test world");

int A=bu.indexOf("t");



System.out.println(A);


int B=bu.lastIndexOf("t");
System.out.println(B);



int c=bu.indexOf("t", 9);
System.out.println(c);


bu.replace(A, c+1, "my");
System.out.println(bu);



StringBuffer A1=new StringBuffer("Hey Hello.My name is Hary");
//replace with Hey Hi,My name is Nick

System.out.println(A1);

String S=A1.substring(4, 9);
System.out.println(S);
A1.delete(4, 10);

System.out.println(A1);
A1.insert(4, "Hi,");
System.out.println(A1);

int x=A1.lastIndexOf("H");
System.out.println(x);

int y=A1.lastIndexOf("y");
System.out.println(y);


A1.replace(18, 23, "Nick");

System.out.println(A1);








}
}