package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		   WebDriver driver=new ChromeDriver();
		    
		   driver.get("file:///C:/Users/Muhammad/Desktop/Training1/SingleDropdown.html");
		   
		   driver.manage().window().maximize();
		   WebElement ele=driver.findElement(By.xpath("//select[@id='Taj']"));
		   Select sel=new Select(ele);
		   List<WebElement>option=sel.getOptions();
		   int count=option.size();
		   System.out.println(count);
		   for(WebElement text:option)
		   {
			   String value=text.getText();
			   System.out.println(value);
			   driver.close();
			   
		   }
	}

}
