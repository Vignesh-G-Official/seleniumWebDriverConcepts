package excelReadWrite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingExcelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Book.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalNumRow=sheet.getLastRowNum();
		int totalNumCol=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total Number of rows:"+totalNumRow);
		System.out.println("Total Number of Col:"+totalNumCol);
		
		for(int r=0;r<=totalNumRow;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalNumCol;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
