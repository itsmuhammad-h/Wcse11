package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeOfKannadaInFbLoginPage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'ಕನ್ನಡ')]"));
		Thread.sleep(2000);
		String attributevalue=ele.getAttribute("href");
		
		System.out.println(attributevalue);
		
		Thread.sleep(2000);
	}

}
