package parametrisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviders {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException
	{
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(2000);
	boolean status=driver.findElement(By.xpath("//h2[normalize-space() = 'My Account']")).isDisplayed();
	if(status==true)
	{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space () = 'Logout']")).click();
		Assert.assertTrue(true);
	}
	
	else
	{
		Assert.fail();
	}
	}
	
	@AfterClass
	void tearDown()
	{
	driver.close();
	}
	
	@DataProvider(name="dp", indices= {0,2})   //indices allows us to choose specific data that we need to pass into the test method
	Object[][] loginData()
	{
		Object data[][]= {
				{"abc@gmail.com", "123"},
				{"xyz@yopmail.com", "xyz"},
				{"vignesh.g1911@gmail.com","VickyVicky@123"}
					};
		return data;
	}
}
