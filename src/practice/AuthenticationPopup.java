package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//https://admin:admin@the-internet.herokuapp.com/basic_auth
		Thread.sleep(3000);
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	Thread.sleep(3000); 
	
	
	
	
	}

}
