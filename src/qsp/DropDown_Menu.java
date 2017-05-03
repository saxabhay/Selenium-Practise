package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_Menu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.actimind.com");
		
		WebElement menu = driver.findElement(By.xpath("//span[text()='About Company']"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//a[text()='Competitive Advantages']")).click();
		
		
		
		

	}

}
