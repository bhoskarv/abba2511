package pakageA;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty ("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();  ////WebDriver Method
	String url= driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();    ////WebDriver Method
	System.out.println(title);
	
	
//	Dimension p= new Dimension(200, 300);
//	driver.manage().window().setSize(p);
	
	Thread.sleep(3000);
	
	WebElement username= driver.findElement(By.xpath("//input[@type='text']"));

	WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
	
	WebElement login= driver.findElement(By.xpath("//button[@value='1']"));
	
	String attributeValue = username.getAttribute("aria-label");   ////WebElement Method 
	System.out.println(attributeValue);
	
	username.sendKeys("bhoskarvitthal@gmail.com");   ////WebElement Method 
	Thread.sleep(2000);
	pass.sendKeys("Vitthal@137");   ////WebElement Method 
	Thread.sleep(2000);
	login.click();   ////WebElement Method 
	Thread.sleep(3000);
	driver.quit();
}
}
