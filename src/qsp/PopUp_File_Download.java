package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class PopUp_File_Download {

	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile profile = new FirefoxProfile();

		String key = "browser.helperApps.neverAsk.saveToDisk";

		String value = "application/zip";
		profile.setPreference(key, value);

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");

		WebDriver driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.seleniumhq.org");

		driver.findElement(By.linkText("Download")).click();
		
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("close")).click();

		driver.findElement(By.xpath("//td[text()='Java']/../td[4]//a")).click();

	}

}
