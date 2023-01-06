package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement button=	driver.findElement(By.xpath("//span[text()='Search']"));
	button.click();
	WebElement button1=	driver.findElement(By.xpath("//input[@class='DocSearch-Input']"));
		Actions act=new Actions(driver);
		
		act.contextClick(button1).perform();
		Thread.sleep(2000);
	
	}

}
