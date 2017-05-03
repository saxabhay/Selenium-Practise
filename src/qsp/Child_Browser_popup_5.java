package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Browser_popup_5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String parent = driver.getWindowHandle();
		driver.get("https://www.naukri.com");

		Set<String> allwh = driver.getWindowHandles();
          allwh.remove(parent);
		for (String wh : allwh) {
			driver.switchTo().window(wh);
			driver.close();
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
