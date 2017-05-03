package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Practise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("saxenaabhay7");
		driver.findElement(By.id("next")).sendKeys(Keys.ENTER);
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("Passwd")).sendKeys("yesyamaha123456");
		driver.findElement(By.id("signIn")).click();
		try{
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.titleContains("Inbox"));
		System.out.println("pass");
		}
		catch(Exception e){
			System.out.println("Fail");
		}
		String tit = driver.getTitle();
		System.out.println(tit);
		
		driver.quit();
	}

}
