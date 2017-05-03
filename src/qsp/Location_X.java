package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Location_X {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");

		WebElement email = driver.findElement(By.id("Email"));
		int x1 = email.getLocation().getX();
		System.out.println(x1);

		WebElement next = driver.findElement(By.id("next"));
		int x2 = next.getLocation().getX();
		System.out.println(x2);

		if (x1 == x2) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		driver.quit();
	}

}
