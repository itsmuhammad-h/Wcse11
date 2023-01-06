package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDefaultValueUsingClassnameidnamecssSelector {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/sample.html");
		Thread.sleep(5000);
		
		 driver.findElement(By.className("c1").id("a1").name("n1").cssSelector("input#a1.c1")).clear();
		
		// driver.findElement(By.cssSelector("input#a1.c1")).clear();
		 //driver.close();
		 
		 
		
		
		
		
		
		
		
		
		
		
	}

}
