package pkg2;

public class TestThrows {
	public static int divide(int a,int b)throws ArithmeticException{
		int div=a/b;
		return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 try{
			System.out.println(TestThrows.divide(10, 0));
		}
catch(ArithmeticException e) {
	System.out.println("Number cannot be divided by 0");
	
}
		System.out.println("Rest of the code");
	}

}//
