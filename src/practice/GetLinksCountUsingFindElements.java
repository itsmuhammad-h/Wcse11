package practice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinksCountUsingFindElements {

public static void main(String[] args) throws Throwable {
						// TODO Auto-generated method stub

																						
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	 driver.get("file:///C:/Users/Muhammad/Desktop/Training1/CountOfLInksUsingFindElements.html");
	   
	
	 List<WebElement> links =driver.findElements(By.tagName("a"));
	   
	            int Count=links.size();
	            System.out.println(Count);
	            driver.close();
 }

}
