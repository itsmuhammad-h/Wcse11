package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethodDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		System.setProperty( "webdriver.chrome.driver","./drivers/chromedriver.exe"); //which browser to launch &  //path of the driver executable file
		
		  //path of the driver executable file
		
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    
		
		
		driver.get("https://www.facebook.com/login/");
		//facebook login button xpath
		WebElement ele= driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']"));
	      
		 String css=ele.getCssValue("background-color");
		 System.out.println(css);
		
		 String css1=ele.getCssValue("line-height");
		 System.out.println(css1); 
		 
		
		driver.close();
		
		
		
		
	}

}
