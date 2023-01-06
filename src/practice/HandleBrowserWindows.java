package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.navigate().to("https://www.orangehrm.com/");
			
			//getWindowHandle
		String windowID=driver.getWindowHandle();
		 System.out.println( windowID); // used to get window id of parent window only
		 
		 //opening child window using xpath locator 
driver.findElement(By.xpath("//img[@src='/_resources/themes/orangehrm/dist/images/social-icon/facebook.png']")).click();
		 //getWindowHandles()
		Set<String> windowIDs= driver.getWindowHandles();
		System.out.println(windowIDs);
		
		for(String i:windowIDs)
		{
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);//printing titles of both the window tabs
			
	if(t.equals("OrangeHRM - World's Most Popular Opensource HRIS - Home"))//here im closing child window using if statement
	 {
		driver.close();
		
	}
			
	} 
		
		 
		 
	}
}


