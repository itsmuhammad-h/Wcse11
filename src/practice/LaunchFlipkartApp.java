package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchFlipkartApp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	 
	driver.get("");
WebElement ele=	driver.findElement(By.xpath("//input [@type='text']"));
	Point  locn= ele.getLocation();
		int x=	locn.getX();
		System.out.println(x);
	int y=locn.getY();
	System.out.println(y);
	Thread.sleep(5000);
	driver.close();
	
 }

}
