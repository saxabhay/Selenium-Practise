package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup_FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.actimind.com/contact.php");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("file")).sendKeys("C:\\Users\\saxabhay\\Documents\\Leave_Details.txt");

	}

}
