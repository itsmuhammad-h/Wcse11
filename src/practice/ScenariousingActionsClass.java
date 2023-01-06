package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenariousingActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get("https://demoapp.skillrary.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      WebElement button=driver.findElement(By.id("course"));
	      WebElement button1=driver.findElement(By.xpath("//a[text()='Selenium Training']"));
	    
	      Actions act=new Actions(driver);
	      act.moveToElement(button).perform();
	      act.moveToElement(button1).click().perform();
	      
	      WebElement button2= driver.findElement(By.id("add"));
	     act.doubleClick(button2).perform();
	      
	      
	}

}
