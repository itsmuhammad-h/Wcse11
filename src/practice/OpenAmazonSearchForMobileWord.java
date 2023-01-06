package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazonSearchForMobileWord {

	public static void main(String[] args)  throws Throwable{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	
		
		
		
	}

}
