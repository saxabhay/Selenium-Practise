package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_ISQTB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://www.istqb.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.xpath("//span[text()='FOUNDATION']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menu).perform();
		WebElement enroll = driver.findElement(By.xpath("(//span[text()='ENROLLMENT'])[1]"));

		actions.moveToElement(enroll).perform();

		WebElement coenroll = driver.findElement(By.xpath("//span[text()='CORPORATE ENROLLMENT']"));

		actions.moveToElement(coenroll).perform();
		
		driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']")).click();

	}

}
