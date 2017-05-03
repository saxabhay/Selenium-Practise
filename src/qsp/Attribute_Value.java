package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute_Value {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/saxabhay/Desktop/html/DemoAttribut.html");
		
		WebElement un = driver.findElement(By.id("un"));
		
        String val = un.getAttribute("value");
        System.out.println(val);
        driver.quit();
	}

}
