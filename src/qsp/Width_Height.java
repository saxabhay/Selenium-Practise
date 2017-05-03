package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Width_Height {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

		WebElement mobile = driver.findElement(By.id("u_0_6"));
		int w1 = mobile.getSize().getWidth();
		int h1 = mobile.getSize().getHeight();

		WebElement remobile = driver.findElement(By.id("u_0_9"));
		int w2 = remobile.getSize().getWidth();
		int h2 = remobile.getSize().getHeight();

		if (w1 == w2 & h1 == h2) {
			System.out.println("pass");

		} else {
			System.out.println("fail");
		}
		driver.quit();
	}

}
