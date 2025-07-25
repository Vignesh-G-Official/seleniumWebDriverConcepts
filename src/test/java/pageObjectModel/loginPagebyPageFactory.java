package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPagebyPageFactory {

	WebDriver driver;
	
	//Constructor
	loginPagebyPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);   //Mandatory step for pagefactory approach
	}
	
	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	//@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")   //Another method for creating locators 
	WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	//Action Methods
	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
}
