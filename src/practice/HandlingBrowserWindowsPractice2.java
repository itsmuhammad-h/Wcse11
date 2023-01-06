package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWindowsPractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,440)");
		
		 String parentwindow=driver.getWindowHandle();
		 System.out.println("parent window :"+parentwindow);
		 driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		 
Set<String> handles=driver.getWindowHandles();
for(String handle:handles)
{
	System.out.println(handle);
	if(!handle.equals(parentwindow))
	{
		//switching to window sub page 
	driver.switchTo().window(handle);
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("hello");
	Thread.sleep(3000);
	driver.close(); //sub window is killed here we need to transfer control to main window to perform any action
	}
	
}
//main page 
   driver.switchTo().window(parentwindow); //switching to main window //button[@id='newTabBtn']
   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hello bruh");

    
	//new tab
   driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();//button[@id='alertBox']
   
   driver.findElement(By.xpath("//button[@id='alertBox']")).click(); // alert button 

 
   driver.findElement(By.xpath("//button[text()='Click me']")).click();
   Alert a=driver.switchTo().alert();
   a.accept();
   
   driver.switchTo().window(parentwindow);
   
   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("yoo yoo");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
