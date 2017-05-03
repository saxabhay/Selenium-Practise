package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Max_Length {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/saxabhay/Desktop/html/MaxLength.html");

		WebElement msg = driver.findElement(By.id("t1"));
		msg.sendKeys("abhay");
		String val = msg.getAttribute("value");

		if (val.length() <= 4) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		driver.quit();
	}

}
