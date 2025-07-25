package fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFiles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
				
		//Single file upload
		/*
		File file = new File("C:\\QA\\test.txt");
		System.out.println("File exists: " + file.exists());
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file.getAbsolutePath());
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("test.txt"))
		{
			System.out.println("File uploaded successfully");
		}
		else
		{
			System.out.println("File uploading filed");
		}
		*/
		
		//Multiple file upload
		String File1="C:\\QA\\test.txt";
		String File2="C:\\QA\\test1.txt";
				
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(File1+"\n"+File2);
		int noOfFiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		//Validate no of files
		if(noOfFiles==2)
		{
			System.out.println("2 File uploaded successfully");
		}
		else
		{
			System.out.println("File uploading filed");
		}
		
		//Validate names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("test.txt") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("test1.txt"))
		{
			System.out.println("Right files uploaded");
		}
		else
		{
			System.out.println("Uploaded files are wrong");
		}
			
		
	}

}

