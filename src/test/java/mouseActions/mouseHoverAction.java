package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.examtopics.com/exams/istqb/ctfl-v4-0/");
		driver.manage().window().maximize();
		
		WebElement popularExams=driver.findElement(By.xpath("//a[normalize-space()='Popular Exams']"));
		WebElement google=driver.findElement(By.xpath("//a[normalize-space()='Google']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(popularExams).perform();
		act.moveToElement(google).click().perform();
		

	}

}
