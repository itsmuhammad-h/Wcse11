package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffBetweenClickAndWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
		
        //submitting form with submit()
		//driver.findElement(By.id("pass")).submit();
        
        //submitting form with click
       driver.findElement(By.name("login")).click();
        
		
		//driver.quit();
		
		
		
	}

}
