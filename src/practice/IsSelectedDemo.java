package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty( "webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/CheckWhetherCheckboxIsSelected.html");
	
	
	
	WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	   Boolean b=checkbox.isSelected();
	   System.out.println(b);
       
}
}
