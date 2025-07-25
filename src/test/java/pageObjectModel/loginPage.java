package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	//Constructor
	loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
    By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action Methods
	public void setUserName(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(btn_login_loc).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
}
