package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copy_NoShortcut {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement un = driver.findElement(By.name("userName"));
	     un.sendKeys("demo");
		 String val = un.getAttribute("value");
		 System.out.println(val);
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys(val);
        
	}

}
