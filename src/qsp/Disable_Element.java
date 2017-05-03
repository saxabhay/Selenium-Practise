package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/saxabhay/Desktop/html/Demo_Disable.html");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		String js = "document.getElementById('un').value='abhay'";
		
	    j.executeScript(js);
		

	}

}
