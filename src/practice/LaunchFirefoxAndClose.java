package practice;

import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverService;

public final class LaunchFirefoxAndClose {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		String key="webdriver.gecko.driver";//which browser to launch
	    String value="./drivers/geckodriver.exe";// path of the drivers executable file
	    System.setProperty(key, value); // specify the path of the drivers executable file to server 
	    FirefoxDriver driver= new FirefoxDriver();
	
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	
	
	}

}
