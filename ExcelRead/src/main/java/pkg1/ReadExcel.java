package pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	public static String getStringData(int a,int b) throws IOException{
	f =new FileInputStream("D:\\Excel files\\School.xlsx");
	wb=new XSSFWorkbook(f);
	sh= wb.getSheet("Sheet1");
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	return c.getStringCellValue();
	}
	public static String getIntegerData(int a,int b) throws IOException{
		f =new FileInputStream("D:\\Excel files\\School.xlsx");
		wb=new XSSFWorkbook(f);
		sh= wb.getSheet("Sheet1");
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
	}

}
