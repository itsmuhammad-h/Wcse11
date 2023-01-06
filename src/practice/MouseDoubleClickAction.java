package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		   WebDriver driver=new ChromeDriver();
		 
		   driver.manage().window().maximize();
		   driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		   
           driver.switchTo().frame("iframeResult");
           
     WebElement button=
     driver.findElement(By.xpath("//p[contains(text(),'Double-click this paragraph to trigger a function.')]"));
      Actions act=new Actions(driver);
      act.doubleClick(button).perform();
      
	
     
	
	
	
	
	}

}
