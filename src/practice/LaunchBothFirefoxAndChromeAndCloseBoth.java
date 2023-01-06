package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBothFirefoxAndChromeAndCloseBoth {

public static void main(String[] args) throws  Throwable{
		// TODO Auto-generated method stub
 String key="webdriver.chrome.driver";

String value="./drivers/chromedriver.exe";     

System.setProperty(key, value);
		
ChromeDriver driver=new ChromeDriver();		
		
	Thread.sleep(5000);	
	driver.close();
		
String key1="webdriver.gecko.driver";
String value1="./drivers/geckodriver.exe";

System.setProperty(key1, value1);
FirefoxDriver driver1 =new FirefoxDriver();

		
		Thread.sleep(5000);
		driver1.close();
		
		
		
		
	}

}
