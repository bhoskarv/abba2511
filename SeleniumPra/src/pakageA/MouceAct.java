package pakageA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouceAct {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement tryIt= driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		
	//	tryIt.click();
		
		Actions x= new Actions(driver);
		
		x.moveToElement(tryIt).click().build().perform();
		
		System.out.println("hi");
		
//		x.click(); 
//		x.doubleClick();
//		x.contextClick();
//		x.moveToElement(tryIt);
//		x.build();
//		x.perform();
//		x.dragAndDrop(Source, Dest);

}
}
