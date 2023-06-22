
public class Employee1 {
int id;
String name;
Address address;
	public Employee1(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj1=new Address("Trivandrum","Kerala","India",695583);
         Employee1 obj=new Employee1(1,"Arathy", obj1);
         obj.display();

	}
public void display() {
	System.out.println(id +"\n" + name);
	System.out.println(address.city + "\n" + address.State + "\n"+ address.Country +"\n" + address.zipcode);
}
}
