package pakageA;


import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alert= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		
		alert.click();
		
//		driver.switchTo().frame(1);			// 1st type of iframe handel by using index
		
//		driver.switchTo().frame("iframeResult");		//2nd way of iframe handle to by attribute value
		
		WebElement iframe= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));   //3rd way
		driver.switchTo().frame(iframe);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement tryIt= driver.findElement(By.xpath("//button[text()='Try it']"));   
		tryIt.click();
		
		Thread.sleep(2000);
		
		Alert c_alart= driver.switchTo().alert();		//alert pop up handle here
		
		
		String popup= c_alart.getText();
		System.out.println(popup);
		c_alart.accept();
		Thread.sleep(2000);
//	
		
//		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		
	
		
		
		
//		String url= driver.getCurrentUrl();
//		System.out.println(addr.get(0) + "   "+url);
//		
//		driver.switchTo().window(addr.get(1));
//		url = driver.getCurrentUrl();
//		System.out.println(addr.get(1) + "     "+url);
//		
//		driver.switchTo().window(addr.get(2));
//		url= driver.getCurrentUrl();
//		System.out.println(addr.get(2)+"    "+url);
//		
//		driver.switchTo().window(addr.get(3));
//		url= driver.getCurrentUrl();
//		System.out.println(addr.get(3)+"    "+url);
//		
//		driver.switchTo().window(addr.get(4));
//		url= driver.getCurrentUrl();
//		System.out.println(addr.get(4)+"    "+url);
		

		
		
	}

}
