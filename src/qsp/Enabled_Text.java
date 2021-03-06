package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enabled_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		try {
			WebElement email = driver.findElement(By.id("email"));

			if (email.isEnabled()) {
				System.out.println("Email is Enabled");
			} else {
				System.out.println("Email is not Enabled");

			}
		} catch (Exception e) {
			System.out.println("Element not Present");
		}
		driver.quit();
	}




	}


