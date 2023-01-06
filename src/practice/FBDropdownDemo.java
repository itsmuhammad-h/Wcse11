package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class FBDropdownDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("file:///C:/Users/Muhammad/Desktop/Training1/SingleDropdown.html");
 WebElement ele=driver.findElement(By.id("Taj"));
Select sel=new Select(ele);
//single select
sel.selectByIndex(2);
Thread.sleep(3000);
sel.selectByValue("C");
Thread.sleep(3000);
sel.selectByVisibleText("Puri");
Thread.sleep(3000);

//multi select
    List<WebElement> option=    sel.getOptions();
  int count=  option.size();
System.out.println("dropdown count"+count);


//to sort dropdown list we are declaring an array and storing that list

ArrayList<String> list=new ArrayList<String>();
for(WebElement i:option)
{
	String alltext= i.getText();
	System.out.println("unsorted dropdown :" + alltext);
	list.add(alltext);
}

System.out.println();

Collections.sort(list);
for(String sortedtext:list)
{
	System.out.println("sorted dropdown list :" + sortedtext);
}
 
	
}
}