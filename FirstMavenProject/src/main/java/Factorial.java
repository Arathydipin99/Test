
public class Factorial {
int n; int temp=1;int i=1;
	public  void fact(int n){
		
		for(int i=1;i<=n;i++){
		temp=temp*i;
		if(i==n){
			factorial();	
		
		}
			
		}
		
	}
			
		
	public void factorial() {
		
		System.out.println("Factorial of the the number is " + temp );
             
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial obj=new Factorial();
obj.fact(8);
	}

}
