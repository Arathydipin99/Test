package pkg1;

import java.io.IOException;

public class ReadMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String d=ReadExcel.getStringData(0, 1);
System.out.println(d);
String e=ReadExcel.getIntegerData(2, 0);
System.out.println(e);
	}

}
