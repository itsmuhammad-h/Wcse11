package practice;

import java.lang.StackWalker.Option;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class PermissionPopups {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		
		  ChromeOptions options=new ChromeOptions();
			
	       //--disable-notifications will disable chrome browser permission popup notifications
		  options.addArguments("--disable-notifications");
		     
		  
			//here we hve passed instance of ChromeOPtions to Webdriver
			WebDriver driver =new ChromeDriver(options);
			driver.get("https://www.justdial.com/");
			
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
