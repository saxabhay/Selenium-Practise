package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Browser_popup_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.naukri.com");

		Set<String> allwh = driver.getWindowHandles();

		for (String wh : allwh) {
			driver.switchTo().window(wh);

			String title = driver.getTitle();
			System.out.println(title);
			if (title.equals("Amazon")) {
				driver.close();

			} else {

			}
		}

	}

}
