package practice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/upload");
	//using sendkeys 
	
	//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Muhammad\\Downloads\\DairyUp(3).txt");
	//driver.findElement(By.xpath("//input[@id='file-submit']")).click();
	
	
	//using Robot class
 
	driver.findElement(By.xpath("//div[@id='drag-drop-upload']")).click();
	 
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();",button); 
	
	//these 2 commands will copy the clipboard 
	StringSelection ss =new StringSelection("C:\\Users\\Muhammad\\Downloads\\DairyUp(3).txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	Thread.sleep(2000);
	
	Robot robot=new Robot();
	robot.keyPress (KeyEvent.VK_CONTROL);
	robot.keyPress (KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress (KeyEvent.VK_TAB);
	robot.keyPress (KeyEvent.VK_TAB);
	robot.keyPress (KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	
 WebElement ele=	driver.findElement(By.xpath("//input[@id='file-submit']"));
 ele.click();
	
	
	
	
	}

}
