package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear_WithoutClear {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("abhaysaxena");

		driver.findElement(By.id("email")).clear();

		driver.findElement(By.id("email")).sendKeys("abhay");

		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);

		driver.findElement(By.id("email")).sendKeys("aby");

		

	}

}
