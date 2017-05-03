package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup_Window {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"p");
		
		Runtime.getRuntime().exec("C:\\Users\\saxabhay\\Documents\\p1.exe");

	}

}
