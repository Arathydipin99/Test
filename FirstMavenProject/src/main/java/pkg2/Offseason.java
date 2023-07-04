package pkg2;

public class Offseason extends Purchase{
int marketprice=5000;
int discount;
	public static void main(String[] args) {
		
	}
	public void discount() {
		discount=15*marketprice/100;
		System.out.println("Discount in offseason =" + discount);
	}

}
