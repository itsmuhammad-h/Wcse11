package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		   WebDriver driver=new ChromeDriver();
		    
		   driver.get("file:///C:/Users/Muhammad/Desktop/Training1/SingleDropdown.html");
		   
		   driver.manage().window().maximize();
		   WebElement ele=driver.findElement(By.xpath("//select[@id='Taj']"));
		   Select sel=new Select(ele);
		   sel.selectByIndex(1);
		   Thread.sleep(3000);
		   sel.selectByValue("C");
		   Thread.sleep(3000);
		   sel.selectByVisibleText("Dosa");
		  // driver.close();
		
		
	}

}
