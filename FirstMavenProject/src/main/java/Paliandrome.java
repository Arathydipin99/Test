import java.util.Scanner;

public class Paliandrome {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.next();
	int n= str.length();
	boolean flag=false;
	for(int i=0;i<n/2;i++) {
		if(str.charAt(i)==str.charAt(n-i-1)) {

	     flag=true;
			
		}
		else {
			flag=false;
		}
	}
		
		if(flag==true) {
			System.out.println(str + " is Paliandrome");
			
	}
		else if(flag==false) {
			System.out.println(str + " is not a Paliandrome");
			
		}
	
	}


}

	


