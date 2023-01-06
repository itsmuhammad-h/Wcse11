package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWhetherElementIsEnabled {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/ElementIsEnabledOrNot.html");
		Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//input[@type='text'  and @value='abc']"));
	
	boolean b=ele.isEnabled();
	if(b)
	{
		System.out.println("textbox is enabled");
		
	}
	else
	{
		System.out.println("textbox is disabled");
	}
		}
	}


