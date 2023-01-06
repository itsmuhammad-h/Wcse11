package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCountOfLinksAndImageFromAmazon {

	public static void main(String[] args) throws Throwable {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
	   List<WebElement> links=
	    driver.findElements(By.xpath("//a | //img"));  //for total count of links and images 
	   
	    
	    List<WebElement> links1=
	    	  driver.findElements(By.xpath(" //a")); // total count of only links  
	    
	    
	   List<WebElement> links2=
	        driver.findElements(By.xpath("//img"));  // total count of only  images 
	   
	      int Count=  links.size();
	      System.out.println(Count);
	       
	      int Count1=links1.size();
	       System.out.println(Count1);
	       
	       int Count2=links2.size();
	       System.out.println(Count2); 
	       
	       driver.close();
	
	
		

	}

}
