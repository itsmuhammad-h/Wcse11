package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataWithoutCLearMethod {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/ClearDataWithoutlearMethod.html");
		
	WebElement ele=driver.findElement(By.xpath("//input[@type='text' and @value='abc'] "));
	
	Thread.sleep(2000);
	
	//ele.clear();
	ele.sendKeys(Keys.CONTROL+"a");//selects all the value
	
	Thread.sleep(2000);
	ele.sendKeys(Keys.DELETE);//deletes the selected value
	driver.close();
	
	
}
}
