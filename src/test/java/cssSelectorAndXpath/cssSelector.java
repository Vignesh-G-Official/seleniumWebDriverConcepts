package cssSelectorAndXpath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cssSelector {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
        wd.get("https://demo.nopcommerce.com/");
        wd.manage().window().maximize();
        
      //tag id tag#id
        wd.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac");
        
      //tag class tag.classname
        //wd.findElement(By.cssSelector("button.button-1 ")).click();
        
        //tag attribute		tag[attribute= 'value']
        //wd.findElement(By.cssSelector("button[type='submit']")).click();
        
        //tag class attribute tag.classname[attribute="value"]
        wd.findElement(By.cssSelector("button.button-1[type='submit']")).click();
        }

}
