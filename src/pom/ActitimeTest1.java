package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTest1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
	    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actitime act=new Actitime(driver);
        act.username("trainee");  
        act.password("trainee");  
        act.loginbutton();
        
        		
        
	}

}
