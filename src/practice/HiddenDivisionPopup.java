package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub
		
				
				  ChromeOptions options=new ChromeOptions();
					
			       //--disable-notifications will disable chrome browser permission popup notifications 
				  //we should pass the ChromeOPtions object reference in 
				  options.addArguments("--disable-notifications");
					
				//here we hve passed instance of ChromeOPtions to Webdriver
				  WebDriver driver =new ChromeDriver(options); 
				     
			
					driver.get("https://www.busonlineticket.com/");
					
					driver.findElement(By.xpath("//input[@id='txtOrigin']")).sendKeys("Hyderabad");
					driver.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("banaglore");
					
					//calender popup
					driver.findElement(By.xpath("//input[@id='txtDepartDate']")).click();
					driver.findElement(By.xpath("//a[normalize-space()='17']")).click();
					driver.findElement(By.xpath("//a[normalize-space()='22']")).click();//button[@id='btnBusSearchNew']
					
					Thread.sleep(3000);
					// clicking on searchbutton
					driver.findElement(By.xpath("//button[@id='btnBusSearchNew']")).click();
				
	}

}
