package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkJava {

	public static void main(String[] args ) throws Throwable
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/googlelink.html");
		Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.tagName("a"));
		//ele.click();
		//driver.findElement(By.id("a1")).click();
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.name("n1")).click();
		//driver.findElement(By.name("c1")).click();
		driver.close();	
		
	} 

}
