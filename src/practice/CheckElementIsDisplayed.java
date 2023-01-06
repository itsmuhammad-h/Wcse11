package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/CheckElemetIsDisplayed.html");
	WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));	
		
boolean b=ele.isDisplayed();
if(b)
{
	System.out.println("textbox is displayed");
	
}
else
{
	System.out.println("textbox is not displayed");
}
	}

}
