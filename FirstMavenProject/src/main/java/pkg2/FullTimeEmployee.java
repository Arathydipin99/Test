package pkg2;

public class FullTimeEmployee extends Employee1 {
	FullTimeEmployee(String name, int paymentperhour){
		super(name,paymentperhour);
	}
	public void calculateSalary() {
		int Salary=paymentperhour*8;
		System.out.println(Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
