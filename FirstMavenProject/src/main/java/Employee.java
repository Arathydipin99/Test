import java.util.Scanner;

public class Employee {
	int basicpay;
	int deduction;
	int bonus;
	Scanner sc=new Scanner(System.in);

	

	public static void main(String[] args) {

		
		
		
	}
	public void display() {
	System.out.println("Basic pay of employee is");
	 basicpay=sc.nextInt();
	System.out.println("Deduction is");
	 deduction=sc.nextInt();
	System.out.println("Bonus is");
	bonus=sc.nextInt();
		
	}
}
