package practice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileaUploadDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		 WebDriver driver =new ChromeDriver();
		 
	/*	 //example 1
		 driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Muhammad\\Downloads\\DairyUp(3).txt");
	
		*/
		 //just locate the choose file button and use  driver.findElementz(By.xpath("//jbecechb")).sendkeys("filepath");
		
	/*	 //example 2
		 driver.get("https://blueimp.github.io/jQuery-File-Upload/");

	driver.findElement(By.xpath("//input[@name='files[]']")).sendKeys("C:\\\\Users\\\\Muhammad\\\\Downloads\\\\DairyUp(3).txt");
	*/
		
		 //example3
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	StringSelection s=new StringSelection("C:\\Users\\Muhammad\\Downloads\\menu.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	
	Robot robot=new Robot();
	// press control+v
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	//release control+v
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	
	}

}
