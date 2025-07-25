package handleSSLExpiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class acceptSSLPage {

	public static void main(String[] args) {
		
		/*Without handling SSL issue of the web page. SSL expired
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.print("Title of the page: "+driver.getTitle());  //Privacy error
		driver.quit();
		*/
		
		ChromeOptions options=new ChromeOptions(); //creating object for chromeoptions
		options.setAcceptInsecureCerts(true);   //Accepting insecure certs using this method
		WebDriver driver=new ChromeDriver(options);  //Passing options in chromedriver.
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.print("Title of the page: "+driver.getTitle());  //expired.badssl.com
		driver.quit();
	

	}

}
