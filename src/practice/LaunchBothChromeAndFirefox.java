package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBothChromeAndFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String key1 ="webdriver.chrome.driver"; //which browser to launch
		
		String value1="./drivers/chromedriver.exe";  //path of the driver executable file
		
		System.setProperty(key1,value1); // specify the path of driver executable file to server
		
		ChromeDriver driver = new ChromeDriver(); //launch only empty Chrome browser
	
		

		String key2 = "webdriver.gecko.driver"; //which browser to launch
		
		String value2 = "./drivers/geckodriver.exe";  //path of the driver executable file
		
		System.setProperty(key2 , value2); // specify the path of driver executable file to server
		
		FirefoxDriver driver2 =new FirefoxDriver();
	}

}
