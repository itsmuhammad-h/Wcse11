package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInsideTextFieldUsingIDLocator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/cssexmple.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("muhammad");
		
		
	}

}
