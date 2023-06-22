
public class Reverse {
	int r,s,n;
 Reverse(int n, int r, int s) {
		
		this();
	
	this.r = r;
	this.s = s;
	this.n = n;
	
}
	Reverse(){
		System.out.println("The reverse of the given number is" );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Reverse obj=new Reverse(12345,0,0);
obj.display();
	}
	public void display() {
		while(n!=0) {
		r=n%10;
		s=s*10+r;
		n=n/10;
		
		
	}
	
		System.out.println(s);
	}
}
