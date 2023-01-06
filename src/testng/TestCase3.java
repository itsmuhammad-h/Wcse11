package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {
	
	 WebDriver driver;
	 
	 @BeforeTest
	 public void openApp()
	 {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.actitime.com/login.do");


	 }
	 @Test
	 public void link()
	 {
		 driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Reporter.log( driver.getCurrentUrl(),true);
		Reporter.log(driver.getTitle(),true);
	 }
	 
	 @AfterTest
	 public void closeApp()
	 {
	   driver.close(); 
	 }

}
