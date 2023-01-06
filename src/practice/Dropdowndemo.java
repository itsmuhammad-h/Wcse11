package practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdowndemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
System.setProperty( "webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/SingleDropdown.html");
	
	WebElement ele=	driver.findElement(By.id("Taj"));

Select sel=new Select(ele);

 sel.selectByIndex(1);
Thread.sleep(3000);
sel.selectByValue("D");
Thread.sleep(2000);
sel.selectByVisibleText("Puri");
Thread.sleep(2000);
     
List<WebElement> option=sel.getOptions();
 int count=option.size();
 System.out.println(count);
 
ArrayList<String> list=new ArrayList<String>();
 
 for(WebElement i:option)
{
	
String text=i.getText();

list.add(text); 


}
 Collections.sort(list);
 for(String sortedtext:list)
 {
	 System.out.println(sortedtext);
 }
	
	}
}
