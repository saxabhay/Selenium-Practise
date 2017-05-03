package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CB_Select_Deselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/saxabhay/Desktop/html/Cb.html");

		List<WebElement> cb = driver.findElements(By.tagName("input"));
		
		int count = cb.size();

		for (WebElement cbs : cb) {
			cbs.click();
		}
		for(int i=count-1;i>=0;i--){
			cb.get(i).click();
		}
	     cb.get(0).click();
	     cb.get(count-1).click();
	}

}
