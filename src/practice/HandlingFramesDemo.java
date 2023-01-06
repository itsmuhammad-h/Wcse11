package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr"); ///by id
		driver.findElement(By.xpath("//p[text()='Your content goes here.']")).sendKeys("hiiii hello how r u bruh");
		
		
		
		driver.switchTo().newWindow((WindowType.TAB));
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(0);
	}

}
