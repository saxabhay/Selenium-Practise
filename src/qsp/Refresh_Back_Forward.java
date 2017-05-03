package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Refresh_Back_Forward {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
