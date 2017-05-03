package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhiteList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://maswhitelisting.amazon.com");

		driver.findElement(By.id("cx_request_ecid_csv")).sendKeys("A1066B9EB4QDTP");

		driver.findElement(By.id("cx_request_agreement")).click();

		driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

		WebElement expdate = driver.findElement(By.id("cx_request_expiration_date"));
		expdate.click();

		driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();

		System.out.println(expdate.getAttribute("value"));

		driver.findElement(By.id("cx_request_whitelist_ids_")).click();
		driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

		driver.findElement(By.xpath("(//li[text()='US'])[1]")).click();

		driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

		driver.findElement(By.xpath("(//li[text()='US'])[2]")).click();

		driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

		driver.findElement(By.xpath("(//li[text()='US'])[3]")).click();

		driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

		Thread.sleep(5000);

		driver.navigate().refresh();

		Thread.sleep(10000);
		driver.navigate().refresh();
		
		Thread.sleep(10000);
		driver.navigate().refresh();
		
		
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.quit();
	}

}
