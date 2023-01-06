package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//first we have to click the button of [Iframe with in an Iframe] so the we can see frames 
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		// first entering outer frame to get in inner frame
	WebElement outerframe=	driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		// entering innner frame 
		WebElement innerframe	=driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Awesome bruh u did it....");
		
		
		
		
	}

}
