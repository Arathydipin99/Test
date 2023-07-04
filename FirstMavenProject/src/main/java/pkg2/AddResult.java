package pkg2;

public class AddResult extends Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AddResult obj1=new AddResult();
	
	obj1.display();
	

	}
	public void display() {
		super.sum();
		if((a+b)%10==0) {
			System.out.println((a+b) + " is divisible by 10 ");
		}
			else {
				System.out.println((a+b) + " is not divisible by 10 ");
			}
		}
	}


