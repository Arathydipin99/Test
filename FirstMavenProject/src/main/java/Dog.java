
public class Dog extends Animal {
	String color = "White";

	Dog() {
		super();
	}

	public void printColor() {
		System.out.println(color);
		System.out.println(super.color);
		super.eat();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
