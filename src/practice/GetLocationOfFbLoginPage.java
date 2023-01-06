package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfFbLoginPage {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	    WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/login/");
	   driver.manage().window().maximize();
	   
	   WebElement ele=driver.findElement(By.xpath("//button[@type='submit']")); //or //button [@id='loginbutton']
	
	   Point locn=ele.getLocation();
	   System.out.println(locn);
	   int x =locn.getX();
	  
	   System.out.println(x);
	   int y =locn.getY();
	   System.out.println(y);
	     
	     driver.close();
	}

}
