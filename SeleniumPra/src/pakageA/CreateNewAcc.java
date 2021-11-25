package pakageA;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAcc {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty ("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement newAcc= driver.findElement(By.xpath("//a[text()='Create New Account']"));
	newAcc.click();
	Thread.sleep(1000);

	WebElement male= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));	
	WebElement female= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	WebElement custom= driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	WebElement pronoun= driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
	
	//male.sendKeys("gffgsglsdfg");       //WebElement method
	male.click();   // WebElement Method 
	Thread.sleep(1000);
	female.click();
	Thread.sleep(1000);
	custom.click();
	Thread.sleep(3000);
	
	Select s= new Select(pronoun);		/// select class 
	s.selectByValue("2");
	s.selectByIndex(1);
	s.
	
	String text =pronoun.getText();   // WebElement Method 
	System.out.println(text);
	
	boolean result1= pronoun.isDisplayed();	   // WebElement Method 
	if (result1==true)
	{
		System.out.println("pronoun is displayed");
	}
	else
	{
		System.out.println("pronoun is not displayed");
	}
	
	boolean result2= pronoun.isEnabled();	   // WebElement Method 
	if (result2==true)
	{
		System.out.println("pronoun is enabled");
	}
	else
	{
		System.out.println("pronoun is not enabled");
	}
	
	boolean result3= pronoun.isSelected();	   // WebElement Method 
	if (result3==true)
	{
		System.out.println("pronoun is Selected");
	}
	else
	{
		System.out.println("pronoun is not Selected");
	}
	
	
	Thread.sleep(3000);
	driver.quit();
	
}
}
