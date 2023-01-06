package practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadUSingRobotClass1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub 
		

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//a[normalize-space()='sample (2).png']")).click();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);// down arrow key will be pressed
		robot.keyPress(KeyEvent.VK_TAB);// tab will be pressed
		robot.keyPress(KeyEvent.VK_TAB);// tab will be pressed
		robot.keyPress(KeyEvent.VK_ENTER);//it will download the image by handling the download popup through keypress key Events using robot class
		

		

}
}
