package checkBoxAlertPopUp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class authenticatedPopUp {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");   //without auth
		
		/*Syntax
		 //http://username:password@the-internet.herokuapp.com/basic_auth
		 */
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
