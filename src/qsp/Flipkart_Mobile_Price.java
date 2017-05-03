package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_Mobile_Price {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("samgsung mobiles");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		WebElement price = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy On5 (Gold, 8 GB)']/../..//div[@class='_1vC4OE _2rQ-NK' and @is='null']"));
         String mp = price.getText();
         System.out.println(mp);
         driver.quit();
		
	}

}
