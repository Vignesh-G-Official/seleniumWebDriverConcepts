package excelReadWrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDynamicDatainExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\dynamicfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("dynamicdata");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many rows:");
		int numberOfRows=sc.nextInt();
		System.out.println("Enter how many cells:");
		int numberOfCells=sc.nextInt();
		
		for(int r=0;r<=numberOfRows;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			for(int c=0;c<=numberOfRows;c++)
			{
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File Created...");
	}

}
