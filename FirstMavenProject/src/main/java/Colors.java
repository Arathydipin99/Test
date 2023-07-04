import java.util.ArrayList;
import java.util.Iterator;
import java.util.Iterator;
public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color=new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		System.out.println(color);
		System.out.println("Returning element :" + color.get(2));
	
		Iterator itr=color.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	color.remove(3);
	System.out.println(color);
	System.out.println(color.contains("Red"));
	
	
}

}
