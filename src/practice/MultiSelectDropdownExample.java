package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement dropdown=driver.findElement(By.id("cars"));
		  Select sel=new Select(dropdown);
		 Thread.sleep(2000);
		  sel.selectByIndex(0);
		  Thread.sleep(2000);
		  sel.selectByValue("99");
		  Thread.sleep(2000);
		  sel.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		  
		  //to know if dropdown is multi select we use Multiple()
		 /* if(sel.isMultiple())
			{
			//sel.deselectAll();
			
			System.out.println("it is multi select dropdown");
			}
			
			else
			{
				System.out.println("it is not multi select dropdown ");
			}
			*/
		  
		  //for printing all the options go for getOptions();
		  //for printing selected options we go for getAllSelectedoption();
		  
		 
    List<WebElement> options=	sel.getAllSelectedOptions();
	System.out.println("count of list :"+options.size());
	  ArrayList list=new ArrayList();
	  
		  for(WebElement i: options)
		  {
		String alltext=	 i.getText();
		  list.add(alltext);
		  
		  }
		  
		  
		  
		  
		  Collections.sort(list);
		  for(Object i:list) 
		  {
			 System.out.println("sorted list :"+i); 
		  }
		 
		  
	//	sel.deselectAll(); //it will deselect all options 
		
		
		
		
		
		
	}

}
