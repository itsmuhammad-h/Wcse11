package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		//  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		   WebDriver driver=new ChromeDriver();
		    
		   driver.get("file:///C:/Users/Muhammad/Desktop/Training1/Mainpage.html");
		   
		   driver.manage().window().maximize();
		   Thread.sleep(30000);
		 WebElement ele=  driver.findElement(By.xpath("//iframe[@id='f1']")); // id of mainpage frame
		   driver.switchTo().frame(0);//name,id or index 0,1,2,3 goes on
		   
		   driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("1234560");// sending data to textbox of subpage
		   Thread.sleep(3000);
		   driver.switchTo().defaultContent();// returning back the control frm frame to defaultContent();
		   
		   //sending input to main mainpage textbox
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		   Thread.sleep(3000);
		   driver.close();
		   
		   
		
		
		
	}

}
