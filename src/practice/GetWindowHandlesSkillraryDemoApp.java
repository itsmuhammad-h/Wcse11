package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesSkillraryDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
	     driver.get("https://skillrary.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//*[text()='GEARS']")).click();
	     driver.findElement(By.xpath("//div[@class='menu_container']//a[@class='ignorelink'][normalize-space()='SkillRary Essay']")).click();
	 
	     String parent= driver.getWindowHandle();
	     System.out.println(parent);
	     
	     
	Set<String> child   =driver.getWindowHandles();
	System.out.println(child);
	
	
	
	for(String e:child)
	{
	String title=	driver.switchTo().window(e).getTitle(); //this statment is switching control from main page to new opend tab or window if we comment this line it wont switch
	System.out.println("titles :"+title);                    
	}

	driver.findElement(By.xpath("//input[@id='mytext']")).sendKeys("hellllo");

	for(String e:child)
	{
		if(e.equals(e))
		{
			driver.switchTo().window(parent); 
			driver.findElement(By.name("q")).sendKeys("manual");
		}
	}
	     
}
}
