package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//Find total number of rows in a table
		int totalRows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total No of Rows:"+totalRows);

		//Find total number of columns in the table
		int totalColumns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total no of Columns:"+totalColumns);
		
		//Find a specific value in the table
		String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
		System.out.println("Row5&Col3:"+bookName);
		
		//Print all the values from the table
		/*System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2; r<=totalRows; r++)
		{
			for(int c=1; c<=totalColumns; c++)
			{
				String tableValues=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(tableValues+"\t");
			}
			System.out.println();
		}
		*/
		//Print books written by Author Amit
		
		/*for(int r=2; r<=totalRows; r++)
		{
				String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				
				if(author.equals("Amit"))
				{
					String authorBook=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.println(authorBook);
				}
		}
		*/
		
		//Find total cost of the books
		int total=0;
		for(int r=2; r<=totalRows; r++)
		{
			String amount=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			total=total+Integer.parseInt(amount);
		}
		System.out.println("Total amount:"+total);
		
	}

}
