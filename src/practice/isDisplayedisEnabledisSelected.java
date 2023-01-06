package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedisEnabledisSelected {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


  System.setProperty( "webdriver.chrome.driver","./drivers/chromedriver.exe"); //which browser to launch &  //path of the driver executable file
		
		  //path of the driver executable file
		
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
		driver.get("https://www.facebook.com/login.php");
		WebElement ele= driver.findElement(By.xpath(" //input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"));
	      		//isdisplayed
        Boolean	isdisplayed=	ele.isDisplayed();
        System.out.println(isdisplayed);
        
                //isenabled
		Boolean isenabled =ele.isEnabled();
		System.out.println(isenabled);
		
		
		
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	WebElement female=	driver.findElement(By.xpath("//label[text()='Female']"));
		
	WebElement male=	driver.findElement(By.xpath("//label[text()='Male']"));
	
	
	//Boolean  femalebutton =female.isSelected();
	//Boolean  malebutton =female.isSelected();
	
	/*System.out.println(femalebutton);
	System.out.println(malebutton);*/
	
	System.out.println(female.isSelected()); //false
	System.out.println(male.isSelected());//false
	
	male.click();
	System.out.println(female.isSelected());
	System.out.println(male.isSelected());
	
	female.click();
    System.out.println(female.isSelected());
	System.out.println(male.isSelected());
	driver.close();   
	
	
	
	}
}
