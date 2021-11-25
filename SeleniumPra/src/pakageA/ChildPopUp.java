package pakageA;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class ChildPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alert= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement promp= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement link= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alert.click();
		confirm.click();
		promp.click();
		link.click();
		
		String mainPage= driver.getWindowHandle();
		String mainPa= driver.getCurrentUrl();
		System.out.println(mainPage +"   "+mainPa);
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());  ///Here we create ref variable to store multiple window addr 
		
		driver.switchTo().window(addr.get(0));   ///here we switch focus of main browser to child 
		String url= driver.getCurrentUrl();
		System.out.println(addr.get(0) + "   "+url);
		
		driver.switchTo().window(addr.get(1));
		url = driver.getCurrentUrl();
		System.out.println(addr.get(1) + "     "+url);
		
		driver.switchTo().window(addr.get(2));
		url= driver.getCurrentUrl();
		System.out.println(addr.get(2)+"    "+url);
		
		driver.switchTo().window(addr.get(3));
		url= driver.getCurrentUrl();
		System.out.println(addr.get(3)+"    "+url);
		
		driver.switchTo().window(addr.get(4));
		url= driver.getCurrentUrl();
		System.out.println(addr.get(4)+"    "+url);
		
		//driver.switchTo().window(p);
		
		
	}

}
