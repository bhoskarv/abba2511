package pakageA;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFbLogin {

	private static final String FileName = null;

	public static void main(String[] args) {

	System.setProperty ("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
	WebDriver driver= new ChromeDriver();
//	
//	//Implicitly Wait
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  ///Implicitly wait
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();  ////WebDriver Method
	String url= driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();    ////WebDriver Method
	System.out.println(title);
	
	
//	Dimension p= new Dimension(200, 300);
//	driver.manage().window().setSize(p);
	
	//Explicit wait
	WebDriverWait wait= new WebDriverWait(driver,10);
	WebElement username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tex']")));
	
	
//	WebElement username= driver.findElement(By.xpath("//input[@type='text']"));

//	WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
//	
//	WebElement login= driver.findElement(By.xpath("//button[@value='1']"));
//	
//	String attributeValue = username.getAttribute("aria-label");   ////WebElement Method 
//	System.out.println(attributeValue);
//	
	username.sendKeys("bhoskarvitthal@gmail.com");   ////WebElement Method 
//	
//	pass.sendKeys("Vitthal@137");   ////WebElement Method 
//
//	login.click();   ////WebElement Method 
	driver.quit();
	
	//Code of take screenshot
	
	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("E:\\Screen\\scr" + username + ".jpeg");
	FileHandler.copy(source, dest);
}

	
}
