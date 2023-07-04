
public class Factorial {
int n;int temp; int i;
	public  void fact(int n){
		 temp=1;
		for(int i=1;i<=n;i++){
		temp=temp*i;
		
			
		}
		
	}
			
		
	public void factorial() {
		fact(6);
		if(i==n){
		System.out.println("Factorial of the number is " + temp );
		}    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial obj=new Factorial();
obj.factorial();
	}

	}
