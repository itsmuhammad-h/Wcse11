package practice;


import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadPopupUsingSendKeysAndRobotClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.monsterindia.com/");
	
		
driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();//clicking upload button 


//clicking select file to upload button and sending file through sendkeys
//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Muhammad\\Downloads\\hello-world-1.pdf");
		


//using JavaScriptExecutor to perform click action if normally click action fail to work we use javascript click method
		
 WebElement button= driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button ); 
		Robot robot=new Robot();
		robot.delay(2000);
		//putting path to clipboard (this statments will copy the path)
StringSelection ss=new StringSelection("C:\\Users\\Muhammad\\Downloads\\hello-world-1.pdf");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

robot.keyPress(KeyEvent.VK_CONTROL); //control
robot.keyPress(KeyEvent.VK_V);       // +v     (control +v)   path is pasted on filename textbox 
robot.keyRelease(KeyEvent.VK_CONTROL); //releasing control  

robot.keyRelease(KeyEvent.VK_V); //releasing v 

robot.keyPress(KeyEvent.VK_ENTER); // pressing enter on file name textbox
robot.keyPress(KeyEvent.VK_ENTER); //pressing enter on open button 

		
}
}


