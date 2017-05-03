package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.actimind.com/contact.php");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@style='text-align: center']")).click();
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("popup is present");
			String text = alert.getText();
			System.out.println(text);
			alert.accept();
		} catch (Exception e) {
			System.out.println("popup is not present");
		}
		driver.quit();
	}

}
