package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropImages {

	public static void main(String[] args) {
	    
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		   WebDriver driver=new ChromeDriver();
		 
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		   	
		   
		   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		   
       
		
		WebElement item1=   driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement item2=   driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement item3=   driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
		WebElement item4=   driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		   
		   WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
	
	
		   Actions act=new Actions(driver);
		   act.dragAndDrop(item1, trash).dragAndDrop(item2, trash).dragAndDrop(item3, trash).dragAndDrop(item4, trash).perform();
		   
		   
	
	}

}
