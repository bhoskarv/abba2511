package pakageA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		WebElement tryIt= driver.findElement(By.xpath("//h2[text()='Line Breaks']"));
		
		JavascriptExecutor x= ((JavascriptExecutor)driver);
		
	
		x.executeScript("arguments[0].scrollIntoView(true);",tryIt);
		 

//		x.executeScript("window.scrollBy(0, 800)");		//Scroll down 2nd method
		  
		 Thread.sleep(1000);
		 System.out.println("hi");
			
}
}
