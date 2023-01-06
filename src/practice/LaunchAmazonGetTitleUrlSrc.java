package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class LaunchAmazonGetTitleUrlSrc {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com");
		
	
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//String src=driver.getPageSource();
		//System.out.println(src);
		
		driver.close();
		
		
		
	}
}