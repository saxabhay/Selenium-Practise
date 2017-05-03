package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Practise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/saxabhay/Desktop/html/iframe1.html");
		
		driver.findElement(By.id("t1")).sendKeys("abc");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("abc");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("def");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("def");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("ghi");
		WebElement e = driver.findElement(By.name("n1"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("ghi");
		
		
	}

}
