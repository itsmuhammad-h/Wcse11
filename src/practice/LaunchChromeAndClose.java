package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeAndClose {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
        String key ="webdriver.chrome.driver"; //which browser to launch
		
		String value="./drivers/chromedriver.exe";  //path of the driver executable file
		
		System.setProperty(key,value); // specify the path of driver executable file to server
		
		ChromeDriver driver = new ChromeDriver(); //launch only empty Chrome browser
	
		Thread.sleep(5000);
	
	    driver.close();
	}

}
