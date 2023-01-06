package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInsideTextField  {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/cssexmple.html");
		Thread.sleep(5000);
		
		driver.findElement(By.tagName("input")).sendKeys("kalpana");
		
//meaning of above line is (in the browser find the element by tagname as input and pass the data...)
	
	}
		
	}


