package practice;

import java.awt.Dimension;
import java.awt.geom.Dimension2D;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
