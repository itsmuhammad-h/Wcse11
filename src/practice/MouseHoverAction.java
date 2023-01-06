package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   
			
		   WebDriver driver=new ChromeDriver();
		 
		   driver.manage().window().maximize();
		   
		   driver.get("https://demo.opencart.com/");
		   
		   WebElement desktopMenu =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));	
		   WebElement macmenuitem =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));	
		   
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(desktopMenu).moveToElement(macmenuitem).click().perform();
		   
	}

}
