package practice;

import java.time.Duration; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractice3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver =new ChromeDriver();
	     driver.get("https://the-internet.herokuapp.com/windows");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
	     
	     //get window handle gets parent window
	      String parentwindow=driver.getWindowHandle();
	      System.out.println( "parent window id  :"+parentwindow);
	      
	      
	     //get window handles gets all windows and tabs opened
	      
	       Set <String> windowids =driver.getWindowHandles();
	       System.out.println( "parent and child  :"+windowids);
	       
	       for(String handles:windowids)
	       {
	    	  String titles=driver.switchTo().window(handles).getTitle();
	    	  System.out.println( "titles   :"  +titles);
	    	  
	    	  //after opening child tab cursor is on child tab 
	    	  
	    	  //switching from child window to parent window
	  	      //Thread.sleep(3000);
	  	   
	    	  if(!handles.equals(parentwindow))
	    	 {
	    	  
	    	 driver.switchTo().window(parentwindow);
	         }
	    	 
	    	 Thread.sleep(3000);
	    	
	    	  
	    	  //switching  from  parent to child window
	    	 
	    	  if(parentwindow.equals(parentwindow))
	    	 {
	    		   driver.switchTo().window(handles);
	    	 
	    	 }
	    	   
	    
	    	  
	    	  
	    	  
	       
	      }
	
    
    
    
	}
}
