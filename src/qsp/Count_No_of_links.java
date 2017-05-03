package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_No_of_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.yahoo.com");

		List<WebElement> allLink = driver.findElements(By.tagName("a"));

		int count = allLink.size();
		System.out.println(count);

		WebElement link = allLink.get(0);
		String text = link.getText();
		System.out.println(text);

		WebElement lastlink = allLink.get(count - 1);
		String last = lastlink.getText();
		System.out.println(last);

	}

}
