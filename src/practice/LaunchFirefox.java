package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String key = "webdriver.gecko.driver"; //which browser to launch
		
		String value = "./drivers/geckodriver.exe";  //path of the driver executable file
		
		System.setProperty(key , value); // specify the path of driver executable file to server
		
		FirefoxDriver driver =new FirefoxDriver();
	}								

}
