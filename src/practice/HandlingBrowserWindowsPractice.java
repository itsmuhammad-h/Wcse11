package practice;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserWindowsPractice {

	public static void main(String[] args) throws Throwable{

		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		//getwindowhandle
	String parentwindowid=	driver.getWindowHandle();
	System.out.println( "parent window id :"+parentwindowid);
	 System.out.println("title of parent window :"+driver.getTitle());
	 
	 
	 //getwindowhandles
	Set<String> childparentid= driver.getWindowHandles();
	
	// System.out.println( "url  :"+driver.getCurrentUrl());

	
	

	for(String wh:childparentid)
	{
		//System.out.println("child parent ids  :"+wh);//prints all window ids available
		
 // String titles=driver.switchTo().window(wh).getTitle(); //prints all  page titles
  
 // System.out.println("titles :"+titles); //prints 

   
	
		if(!wh.equals(parentwindowid) )
		{
			driver.switchTo().window(parentwindowid);
			}
	}

	

	
	
	
	
	Thread.sleep(3000);
	
	for(String whc:childparentid)
	{
		if(whc.equals(parentwindowid) )
		{
			driver.switchTo().window(whc);
			}
	}
	
	
	
	
	
	
	}

	
	}


	

