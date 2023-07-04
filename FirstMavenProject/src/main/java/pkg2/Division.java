package pkg2;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	String s1="java";
	int c=Integer.parseInt(s1);
	
	int b[]= new int[2];
	System.out.println(b[4]);
	
	String s=null;
	System.out.println(s.charAt(0));
	
	int a=10/0;
	}
catch(ArithmeticException e) {
	System.out.println("Division is possible");
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Out of bound");
	
}
catch(NullPointerException e) {
	System.out.println("String found");
}
catch(NumberFormatException e) {
	System.out.println("Java");
}
catch(Exception e) {
	System.out.println("Exception handled");
}
finally {//must executable code written here
	System.out.println("Inside finally block");
}
System.out.println("rest of the code");
}
}
