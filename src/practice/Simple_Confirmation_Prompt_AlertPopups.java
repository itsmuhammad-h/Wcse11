package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Confirmation_Prompt_AlertPopups {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
	
		
		//simple Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	   Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
	 System.out.println( a.getText());
  a.accept();
 // a.dismiss();    
	   
	   //ConfirmationAlert
/*	   
  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
 Thread.sleep(3000);
Alert b= driver.switchTo().alert();
	  System.out.println(b.getText());
	b.accept();    */

		
		
		
		//Prompt alert
		
		 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		 Thread.sleep(3000);	
	 Alert c=	driver.switchTo().alert();
	     c.sendKeys("welcome bruh u r a looser");
	     System.out.println(c.getText());  //i shud print otherwise c.getText(); wont work
        
      c.accept();           
	
	}

}
