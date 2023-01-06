package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationMethods_SizeMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty( "webdriver.chrome.driver","./drivers/chromedriver.exe"); //which browser to launch &  //path of the driver executable file
		
		  //path of the driver executable file
		
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
		
		
		driver.get("https://www.facebook.com/login/");
		WebElement ele= driver.findElement(By.xpath("//button[@value='1']"));
	      
        // Location method 1
        Point locn =ele.getLocation();
        int x=    locn.getX();
        System.out.println("x is "+x);
        int y=    locn.getY();
        System.out.println("y is "+y);     

	   
    
    
    driver.get("https://www.orangehrm.com/");
   WebElement logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo']"));
	      
     
	 
	 //  Location method 2
        System.out.println( logo.getLocation());//prints x & y 
        System.out.println( logo.getLocation().getX()); // x
        System.out.println( logo.getLocation().getY()); //y
        
        
        //Location method 2
	 System.out.println( logo.getRect().getX());
	 System.out.println( logo.getRect().getY());

	 
	 
	 //size method 1
	  
	 System.out.println(logo.getSize());//returns size of logo 
	 
  System.out.println("size of element logo:"+logo.getSize());   //returns size of logo(width,height)
  
    System.out.println("height of element logo: " +logo.getSize().getHeight()); //returns only height
    System.out.println("width  of element logo: " +logo.getSize().getWidth()); //returns only width
	 
	   
    
    //getting Height & Width of element logo using Rect() method which works like size() method
    
    System.out.println("height of element logo: " +logo.getRect().getDimension().getHeight());
    System.out.println("height of element logo: " +logo.getRect().getDimension().getWidth()); 
	driver.close();
	 
	 
}
}