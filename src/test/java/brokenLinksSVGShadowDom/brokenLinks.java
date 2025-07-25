package brokenLinksSVGShadowDom;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//Capture all links from the website
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links: "+links.size());
		
		int noOfBrokenLinks=0;
		int noOfNonBrokenLinks=0;
		
		for(WebElement linkelement:links)
		{
			String hrefValue=linkelement.getAttribute("href");
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("Unable to check the broken link");
				continue;
			}
			
			try
			{
			URL linkURL=new URL(hrefValue);    //converted hrefValue to URL
			HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection();    //Open connection to the
			conn.connect();  //connect to server and send request to the server
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefValue+"====>Broken Link");
				noOfBrokenLinks++;
			}
			else
			{
				System.out.println(hrefValue+"===>Not a broken link");	
				noOfNonBrokenLinks++;
			}
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Total broken links:"+noOfBrokenLinks);
		System.out.println("Total Non broken links:"+noOfNonBrokenLinks);

	}

}
