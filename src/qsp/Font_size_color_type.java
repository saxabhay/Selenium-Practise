package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Font_size_color_type {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("kjzjhzljnhalh");
		driver.findElement(By.id("next")).click();

		WebElement err = driver.findElement(By.id("errormsg_0_Email"));

		String fsize = err.getCssValue("font-size");
		System.out.println(fsize);

		String ffamily = err.getCssValue("font-family");

		System.out.println(ffamily);

		String color = err.getCssValue("color");
		System.out.println(color);

		driver.quit();

	}

}
