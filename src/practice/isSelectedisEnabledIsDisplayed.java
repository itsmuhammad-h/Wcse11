package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedisEnabledIsDisplayed {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
     driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
 WebElement chckbox=driver.findElement(By.xpath("//input[@id='java1' and @value='Java']"));
 chckbox.click();
	



		
	if(chckbox.isSelected())
	{
		
	
		System.out.println("pass:   ");
		//chckbox.isSelected();
		
	}
	else
	{
		chckbox.isSelected();
		System.out.println("Fail: ");
	}

	}

}
