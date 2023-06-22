
public class Car extends Vehicle {
	public void display() {
		System.out.println("car is a vehicle");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car obj=new Car();
obj.display();
Vehicle obj1=new Vehicle();
obj1.display();
Vehicle obj2=new Car();//upcasting(object of car is converted to parent class object)
obj2.display();



	}
	

}
