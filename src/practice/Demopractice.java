package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demopractice {

	public static void main(String[] args)  throws Throwable{
		// TODO Auto-generated method stub

System.setProperty( "webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
		driver.get("https://www.amazon.com/");
		
		//driver.navigate().to("https://www.amazon.com/");
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		 List<WebElement>  ele=driver.findElements(By.xpath("//a | //img"));
	 int count=	ele.size();
	 System.out.println(count); //it will give count of all matching webelements
	 
	 for(WebElement i:ele)
	 {
	String text=i.getText();
	System.out.println(text);
	
	 }
		 
		 
	}
}