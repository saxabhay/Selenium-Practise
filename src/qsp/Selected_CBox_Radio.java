package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selected_CBox_Radio {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		try {
			WebElement rb = driver.findElement(By.id("u_0_i"));
			rb.click();

			if (rb.isSelected()) {
				System.out.println("RB is selected");
			} else {
				System.out.println("RB is not selected");
			}
		} catch (Exception e) {
			System.out.println("Element is not present");
		}
		driver.quit();
	}

}
