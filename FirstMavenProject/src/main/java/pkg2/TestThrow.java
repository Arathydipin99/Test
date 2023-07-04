package pkg2;

public class TestThrow {
	public static void validate(int age) {
		if(age<18) {
			 throw new ArithmeticException("Person is not eligible to vote");   
		}
		else {
			System.out.println("Person is eligible for voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrow.validate(25);
		System.out.println("Rest of the code");
	}

}
