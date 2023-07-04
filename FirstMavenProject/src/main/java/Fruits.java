import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> list=new ArrayList<String>();
list.add("Apple");
list.add("Orange");
list.add("Mango");
list.add(0,"Pear");
list.add("Strawberry");
System.out.println(list);
ArrayList <String> veg=new ArrayList<String>();
veg.add("Carrot");
veg.add("Tomato");
veg.add("Beans");
list.addAll(veg);
System.out.println(list);
System.out.println("Returning element :" + list.get(2) );
list.set(1, "Potato");
list.set(3, "Potato");
System.out.println(list);
System.out.println(list.contains("Mango"));
System.out.println(list.isEmpty());
System.out.println(list.lastIndexOf("Potato"));
Collections.sort(list);
System.out.println(list);

	/*for(String i:list) {
System.out.println(i);
}
/*
 * Iterator itr=list.iterator();//getting the iterator 
 * while(itr.hasNext())
 * {//check if iterator has the elements
 * System.out.println(itr.next());//printing the element and move to next }
 */
	}
}
