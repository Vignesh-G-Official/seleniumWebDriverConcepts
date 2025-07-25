package keyboardSliderTabandWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		try {
			WebElement acceptCookies=driver.findElement(By.xpath("//[@class='fc-button-label')]"));
			acceptCookies.click();
		}
		catch(Exception e) {
			System.out.println("No cookies");
		}
		
		Actions act=new Actions(driver);
		//min slider
		WebElement minSlider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Min slider location: " +minSlider.getLocation());
		act.dragAndDropBy(minSlider, 150, 255).perform();
		System.out.println("Min slider location: " +minSlider.getLocation());
		
		//Max slider
		WebElement maxSlider=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("Max slider location: " +maxSlider.getLocation());
		act.dragAndDropBy(maxSlider, -150, 255).perform();
		System.out.println("Man slider location: " +maxSlider.getLocation());
		
	}

}
