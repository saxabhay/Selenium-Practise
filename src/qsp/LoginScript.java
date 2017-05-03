package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScript {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.gmail.com");

		String expected = "Gmail";
		String actual = driver.getTitle();

		if (actual.equals(expected)) {
			System.out.println("pass");
		} else
			System.out.println("fail");

		driver.quit();

	}

}
