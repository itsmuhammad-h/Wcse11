package practice;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		String key ="webdriver.chrome.driver"; //which browser to launch
		
		String value="./drivers/chromedriver.exe";  //path of the driver executable file
		
		System.setProperty(key,value); // specify the path of driver executable file to server
		
		ChromeDriver driver = new ChromeDriver(); //launch only empty Chrome browser
		
	     
	           
	
	}

}
