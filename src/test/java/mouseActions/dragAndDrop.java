package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement targetItaly=driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement targetspain=driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement targetNorway=driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement targetDenmark=driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement targetNorthKorea=driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement targetSweden=driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement targetUS=driver.findElement(By.xpath("//div[@id='box103']"));
		
		WebElement source=driver.findElement(By.xpath("//div[@id='dropContent']"));
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement seoul=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement copenhegan=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(madrid, targetspain).perform();
		act.dragAndDrop(washington, targetUS).perform();
		act.dragAndDrop(oslo, targetNorway).perform();
		act.dragAndDrop(seoul, targetNorthKorea).perform();
		act.dragAndDrop(copenhegan, targetDenmark).perform();
		act.dragAndDrop(rome, targetItaly).perform();
		act.dragAndDrop(stockholm, targetSweden).perform();
		
		act.dragAndDrop(madrid, source).perform();
		

	}

}
