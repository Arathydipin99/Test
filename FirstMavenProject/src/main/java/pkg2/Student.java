package pkg2;

public class Student {
	int rollnumber;
	String name;
	Address address;



	public Student(int rollnumber, String name, Address address) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.address = address;
	}



	public static void main(String[] args) {
		Address obj=new Address("Nandanam","Silver Park","Kulathoor","Trivandrum","Kerala","India",695583);
		Student obj1=new Student(1,"Aiswarya",obj);
        obj1.display();
	}
public void display() {
	System.out.println(rollnumber + "\n" + name);
	System.out.println(address.Housename + "\n" + address.Lane + "\n" +  address.City + "\n" + address.District );
	System.out.println( address.State + "\n" + address.Country + "\n" + address.zipcode);
}
}
