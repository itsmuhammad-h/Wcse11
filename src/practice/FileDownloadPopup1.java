package practice;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
		
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup1 {

	public static void main(String[] args) throws  Throwable {
		// TODO Auto-generated method stub

	WebDriver driver=new FirefoxDriver();	
	driver.get("https://the-internet.herokuapp.com/download");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Selenium.png']")).click();
	Thread.sleep(3000);	
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);	
		
		
		
	}

}
