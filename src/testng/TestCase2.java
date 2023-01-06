package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {

public	WebDriver driver;

@BeforeMethod
public void openApp()
	{
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demo.actitime.com/login.do");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
   }
	
@Test
public void forgotpassword()
{
   //clicking on forgot your password link
	driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
	
	 //sending some blind data in text box of enter Email or username
	driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("Hero@gmail.com");
	driver.findElement(By.xpath("//div[text()='Request Login Info']")).click();
	Reporter.log(driver.getTitle(),true);
	Reporter.log(driver.getCurrentUrl(),true);
	
}


 @AfterMethod
 
public void close() throws InterruptedException  //just to see the execution ..bruh
{
	 Thread.sleep(2000);
	
 driver.close();
}


}

