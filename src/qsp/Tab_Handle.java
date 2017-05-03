package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tab_Handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.actitime.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Try Free")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("actiTIME Inc")).click();

		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
		for (String wh : allwh) {

			driver.switchTo().window(wh);
			
		}
		Thread.sleep(3000);
		driver.findElement(By.linkText("Try Free")).click();
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("emailAddress")).clear();
		driver.findElement(By.name("sendRequest")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		driver.quit();

	}

}
