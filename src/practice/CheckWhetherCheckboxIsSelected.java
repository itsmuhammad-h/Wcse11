package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWhetherCheckboxIsSelected {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/CheckWhetherCheckboxIsSelected.html");
		Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//input[@type='checkbox']"));
	
	boolean b=ele.isSelected();
	if(b)
	{
		System.out.println("checkbox is selected");
		
	}
	else
	{
		System.out.println("checkbox is not selected");
	}
		}
		
		
		
	}


