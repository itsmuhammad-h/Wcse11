package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTheDefaultValueUsingTagName {

	public static void main(String[] args)  throws Throwable{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/sample.html");
		Thread.sleep(5000);
		
	//	WebElement ele =driver.findElement(By.tagName("input"));
		//ele.clear();
		
		
	driver.findElement(By.cssSelector("input#a1.c1")).clear();
	
	}

}
