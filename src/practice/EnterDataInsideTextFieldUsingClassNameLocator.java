package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInsideTextFieldUsingClassNameLocator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/cssexmple.html");
		driver.findElement(By.className("c1")).sendKeys("Muhammad");
		Thread.sleep(2000);
		driver.close();
		
	}
}
