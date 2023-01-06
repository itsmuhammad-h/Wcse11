package practice;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        System.setProperty( "webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
		driver.get("https://the-internet.herokuapp.com/dropdown");
	 WebElement ele=	driver.findElement(By.id("dropdown"));
	Select sel=new Select(ele);
    sel.selectByIndex(1);
    Thread.sleep(2000);
	sel.selectByValue("2");
	Thread.sleep(2000);
//	sel.selectByVisibleText("Option 2");
//	Thread.sleep(2000);

	List<WebElement>   option= sel.getOptions();
	  int count=option.size();
	  System.out.println("Count is"+count); //gives the count
	ArrayList<String> list=new 	ArrayList<String>();
	
	for(WebElement i:option)
    {
	String alltext=	i.getText();
		System.out.println(alltext);
		list.add(alltext);
		
	}
	

	Collections.sort(list);
	for(String sortedtext: list)
	{
		System.out.println( "sorted list :" +sortedtext);
		
	
	}
	
	if(sel.isMultiple())
	{
		System.out.println("it is multi select dropdown");
	}
    else
	{
		System.out.println("it is not a multi select dropdown");
	}
	
	
	//driver.close();
	
	
}
}

