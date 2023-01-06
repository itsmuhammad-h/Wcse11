package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyHelloAndClearWorldAndPasteHello {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/CopyHelloAndClearWorldAndPasteHello.html");
		
	WebElement ele=driver.findElement(By.xpath("//input[@type='text' and @value='hello'] "));
	
      Thread.sleep(3000);
	
	ele.sendKeys(Keys.CONTROL+"a");//selects all the value
	ele.sendKeys(Keys.CONTROL+"c");//copy the value
	
	
	Thread.sleep(3000);
	ele.sendKeys(Keys.DELETE);//deletes the selected value
	
	WebElement ele1=driver.findElement(By.xpath("//input[@type='text' and @value='world']"));	
	ele1.clear();
	ele1.sendKeys(Keys.CONTROL+"v");
	WebElement ele2=driver.findElement(By.xpath("//a[@href]"));
	ele2.click();Thread.sleep(3000);
	driver.close();
		
		
		
	}

}
