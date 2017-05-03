package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinks_Print {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://news.google.com");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		int count = alllinks.size();
		System.out.println(count);

		
		for (int i = 0; i < count; i++) {
			WebElement link = alllinks.get(i);

			String text = link.getText();

			System.out.println(text);
		}

		driver.quit();
	}

}
