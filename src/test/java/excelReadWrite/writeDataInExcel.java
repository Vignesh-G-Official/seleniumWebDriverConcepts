package excelReadWrite;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataInExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\autofile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet Sheet=workbook.createSheet("Data");
		
		XSSFRow Row1=Sheet.createRow(0);
				Row1.createCell(0).setCellValue("Python");
				Row1.createCell(1).setCellValue("19");
				Row1.createCell(2).setCellValue("Started");
				Row1.createCell(3).setCellValue("Automation");
				
		XSSFRow Row2=Sheet.createRow(1);
				Row2.createCell(0).setCellValue("Java");
				Row2.createCell(1).setCellValue("24");
				Row2.createCell(2).setCellValue("Finished");
				Row2.createCell(3).setCellValue("Automation");	
				
		XSSFRow Row3=Sheet.createRow(2);
				Row3.createCell(0).setCellValue("C#");
				Row3.createCell(1).setCellValue("9");
				Row3.createCell(2).setCellValue("Pending");
				Row3.createCell(3).setCellValue("Automation");
				
		workbook.write(file);
		workbook.close();
		

	}

}
