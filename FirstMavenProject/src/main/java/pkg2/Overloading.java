package pkg2;

public class Overloading {

	public void multi(int a,int b) {
		System.out.println(a*b);
	}
	public void multi(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading obj=new Overloading();
obj.multi(4, 5);
obj.multi(7, 9,3);
	}

}
