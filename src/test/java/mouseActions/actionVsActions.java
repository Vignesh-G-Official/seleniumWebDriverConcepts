package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionVsActions {

public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			
			WebElement button=driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
			
			Actions act=new Actions(driver);
			Action myAction=act.contextClick(button).build(); //Creating Action
			myAction.perform(); //Performing action

	}

}
