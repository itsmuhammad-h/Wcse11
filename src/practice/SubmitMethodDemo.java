package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	//submit() method is used when type='submit' nd to submit forms where type='submit'
	driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).submit();
	Thread.sleep(3000);
	driver.close();
	
	}

}
