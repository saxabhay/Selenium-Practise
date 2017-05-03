package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowser {
	
	public static void testbrowser(WebDriver driver){
		
		
		driver.get("http:\\www.google.com");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String src=driver.getPageSource();
		System.out.println(src);
		
		driver.quit();
	}
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		testbrowser(driver);
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		testbrowser(driver1);
		
		

	}

}
