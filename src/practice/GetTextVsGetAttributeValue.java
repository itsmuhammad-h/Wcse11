package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttributeValue {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://admin-demo.nopcommerce.com/login");
    
    
    WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));// xpath of login button
    System.out.println(ele.getAttribute("type"));//output is submit
    System.out.println(ele.getAttribute("class"));//output is button-1 login-button
    System.out.println(ele.getText());//<button type="submit" class="button-1 login-button" xpath="1">Log in</button>
		
 }
}
