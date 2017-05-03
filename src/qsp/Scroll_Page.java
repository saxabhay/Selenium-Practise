package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scroll_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://news.google.co.in");
		
		RemoteWebDriver r=(RemoteWebDriver) driver;
		for(int i=1;i<=10;i++){
		r.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		}
	}

}
