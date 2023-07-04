package pkg2;

public class Contractor extends Employee1 {
	int workinghour;
Contractor( String name,int paymentperhour, int workinghour){
	super(name,paymentperhour);
	this.workinghour=workinghour;
}

	
public void calculateSalary() {
	int salary=paymentperhour*workinghour;
	System.out.println(salary);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
