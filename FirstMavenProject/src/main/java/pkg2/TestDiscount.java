package pkg2;

public class TestDiscount   {

	public static void main(String[] args) {
		Purchase obj=new Purchase();
		obj.discount();
        Purchase obj1=new Onseason();
        obj1.discount();
        Purchase obj2= new Offseason();
        obj2.discount();

	}
}
