package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOfPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	 driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	 Thread.sleep(3000);
	 //simple alert
	Alert a=driver.switchTo().alert();
	
	String text=a.getText();
	System.out.println(text); 
	a.accept(); // always use accept() at last otherwise statments before wont get executed control will come out of popup
	
//confirmation alert
	
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	 Thread.sleep(3000);

	 Alert b= driver.switchTo().alert();
	String text1= b.getText();
	System.out.println(text1);
	 b.accept();
//prompt alert
driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
Thread.sleep(3000);
	
	 Alert c=driver.switchTo().alert();
	 c.sendKeys("hello bruh u r a looser");
   System.out.println(c.getText());  
	 c.accept(); 
	 
	 
	 
	   
	}

}
