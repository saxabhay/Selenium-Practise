package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Location_Y {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

		WebElement email = driver.findElement(By.id("email"));

		int y1 = email.getLocation().getY();
		System.out.println(y1);

		WebElement pass = driver.findElement(By.id("pass"));

		int y2 = pass.getLocation().getY();
		System.out.println(y2);

		if (y1 == y2) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		driver.quit();
	}

}
