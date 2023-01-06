package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewTab_NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key ="webdriver.chrome.driver"; //which browser to launch
		
		String value="./drivers/chromedriver.exe";  //path of the driver executable file
		
		System.setProperty(key,value); // specify the path of driver executable file to server
		
		WebDriver driver = new ChromeDriver(); //launch only empty Chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/login/");
	 
/*	       System.out.println( driver.getCurrentUrl());
	       System.out.println( driver.getTitle());
	   
	  //   driver.navigate().back();
	   //  driver.navigate().forward();
	 //    driver.navigate().refresh();     */
	   
	
	 
	  
	  // opening a new tab and clicking on a link
       driver.switchTo().newWindow(WindowType.TAB);
	     driver.get("https://online.qspiders.com/classes/3262b55d-dbfe-47b0-84c6-564760ba79f8");
	 
	  
	  
	  //opening a new window and clicking a new link
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://online.qspiders.com/classes/3262b55d-dbfe-47b0-84c6-564760ba79f8"); 
	  
	
	//opening a new tab on same page 
 String tab=Keys.chord(Keys.CONTROL,Keys.ENTER); //if cursor is waiting on a link and Control+enter is pressed it will open a new tab
 driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).sendKeys(tab);
	
	
	
	  //   driver.close();
	     
	     
	 
	 //
	         
	     
	}

}
