
public class Reverse {
	int r,s,n;
 Reverse(int n) {	
	 this.n=n;
     
	while(n!=0) {
		r=n%10;
		s=s*10+r;
		n=n/10;
		
	}
}
	Reverse(){
		this(6789);
		System.out.println("The reverse of the number is " + s );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Reverse obj=new Reverse();
	}
}
