package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_Logout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https:\\www.gmail.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("Email")).sendKeys("saxenaabhay7@gmail.com");

		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("yesyamaha123456");
		driver.findElement(By.id("signIn")).click();

		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();

		driver.findElement(By.xpath("//a[text()='Sign out']")).click();

	}

}
