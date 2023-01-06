package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrlWithoutGetMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   driver.navigate().to("https://www.facebook.com/login/");
	   Thread.sleep(3000);
	   driver.navigate().back();
	   Thread.sleep(3000);
	   driver.navigate().forward();
	   Thread.sleep(3000);
	   driver.navigate().refresh();
	   driver.close();
	   
	   
	}

}
