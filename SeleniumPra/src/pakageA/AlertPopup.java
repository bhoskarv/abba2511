package pakageA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();		
		WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
		//WebElement reset= driver.findElement(By.xpath("//input[@type='reset']"));
		
		submit.click();
		//reset.click();
		
		Alert alt= driver.switchTo().alert();    ////shift selenium focus on alert popup
		
		String s= alt.getText();
		System.out.println(s);
		
		Thread.sleep(2000);
		
		alt.dismiss();
	
		alt.accept();
		
		alt.sendKeys("Vitttal");
		
		Thread.sleep(4000);
	//reset.click();
		
		Thread.sleep(10000);
		
		driver.quit();
		
		//input[@type='submit']

	}

}
