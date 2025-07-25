package dataDriverTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.utils;

public class fdCalculator {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email ID/Mobile No. or User Id']")).sendKeys("blackshadowvignesh1997@gmail.com");
		driver.findElement(By.xpath("placeholder='Password'")).sendKeys("Vignesh@1997");
		driver.findElement(By.xpath("//button[@normalize_space()=Login]"));
		
		String filepath=System.getProperty("User.dir")+"\\testData\\caldata.xlsx";
		
		int row=utils.getRowCount(filepath, "Sheet1");
		
		for(int i=1; i<=row; i++)
		{
			//Read all data from excel
			String price=utils.getCellData(filepath, "Sheet1", i,0);
			String RI=utils.getCellData(filepath, "Sheet1", i,1);
			String per1=utils.getCellData(filepath, "Sheet1", i,2);
			String per2=utils.getCellData(filepath, "Sheet1", i,3);
			String frequency=utils.getCellData(filepath, "Sheet1", i,4);
			String MV=utils.getCellData(filepath, "Sheet1", i,5);	
			
			//Pass data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(RI);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			
			Select perdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			//validation
			String actual_MV=driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
			
			if(Double.parseDouble(MV)==Double.parseDouble(actual_MV))
			{
				System.out.println("Test Passed");
				utils.setcelldata(filepath, "Sheet1", i, 7,"Passed");
				utils.fillGreenColor(filepath, "Sheet1", i,7);
			}
			else
			{
				System.out.println("Test Failed");
				utils.setcelldata(filepath, "Sheet1", i, 7,"Failed");
				utils.fillRedColor(filepath, filepath, row, row);
			}
		}//Ending for the loop
		
		driver.findElement(By.xpath("//div[@class='MT10']//a[2]")).click();
		
		driver.quit();
		
		

	}

}
