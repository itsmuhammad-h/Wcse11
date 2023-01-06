package practice;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataUsingPropertyFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		FileInputStream fis=new FileInputStream("./data.properties");
	       Properties pdata=new Properties();
           pdata.load(fis);
           
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
           driver.get(pdata.getProperty("url")); //passing url of data.properties file
           driver.findElement(By.id("email")).sendKeys(pdata.getProperty("username"));//passing username of data.properties file
           driver.findElement(By.id("pass")).sendKeys(pdata.getProperty("password"));//passing passwrd of data.properties file
           Thread.sleep(3000);                                                       //if we give key it will get value 
           driver.close();

		
		
	
	}

}
