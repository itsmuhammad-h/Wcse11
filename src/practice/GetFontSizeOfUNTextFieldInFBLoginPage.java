package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFontSizeOfUNTextFieldInFBLoginPage {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/login/");
	    Thread.sleep(3000);
	    
	    WebElement ele=
	    driver.findElement(By.xpath("//input[@id='email']"));
	    Thread.sleep(3000);
	                      
	    String  font=  ele.getCssValue("Font-Size");   
	    System.out.println(font);
	    
	    driver.close();
	    
	}

}
