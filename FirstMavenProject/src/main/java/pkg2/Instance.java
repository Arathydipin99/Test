package pkg2;

public class Instance {
public void sum() {
	int a=10;
	int b=9;
System.out.println(a+b);
	
}
public static void add(int a,int b) {
System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instance obj=new Instance();
obj.sum();
Instance.add(5, 8);
	}

}
