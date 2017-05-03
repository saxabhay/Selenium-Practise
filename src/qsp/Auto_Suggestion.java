package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Suggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");

		List<WebElement> sugg = driver.findElements(By.xpath("//div[contains(text(),'selenium')"));
		int count = sugg.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {

			//String at = sugg.get(i).getText();
			System.out.println(sugg.get(i).getText());
		}

		sugg.get(count - 1).click();

	}

}
