package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver","./drivers/chromedrivser.exe");
			
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		    
		   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");
		   
		   driver.manage().window().maximize();
		   // Thread.sleep(30000);
		   WebElement  button=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		   Actions act=new Actions(driver);
		   act.contextClick(button).perform();
	
	}

}
