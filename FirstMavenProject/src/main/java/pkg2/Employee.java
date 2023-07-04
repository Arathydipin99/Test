package pkg2;

public class Employee {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj=new Employee();
obj.setId(1);
System.out.println(obj.getId());
obj.setName("Arathy");
System.out.println(obj.getName());
	}

}
