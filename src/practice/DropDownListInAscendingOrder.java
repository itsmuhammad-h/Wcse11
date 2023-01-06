package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListInAscendingOrder {

	public static void main(String[] args) throws Throwable {
		
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		   WebDriver driver=new ChromeDriver();
		    
		   driver.get("file:///C:/Users/Muhammad/Desktop/Training1/CountOfLInksUsingFindElements.html");
		   
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   WebElement ele=driver.findElement(By.xpath("//select[@id='Taj']"));
		   Select sel=new Select(ele);
		   List<WebElement>option=sel.getOptions();
		   int count=option.size();
		   System.out.println(count);
		   ArrayList<String>list=new ArrayList<String>(); //creates empty array
		   
		   for(WebElement text:option)
		   {
			   String allText=text.getText();
			   list.add(allText); //storing in array
			   
		   }
				   Collections.sort(list);
				   for(String sortedText: list)
				   {
					   System.out.println(sortedText);
				   }
				   driver.close();
		   
				   
	
	}

	
}
