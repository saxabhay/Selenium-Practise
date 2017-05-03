package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Without_Sync {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("demo");
		
		driver.findElement(By.name("password")).sendKeys("demo");
		
		driver.findElement(By.name("login")).click();
		while(true){
			
		try{
		driver.findElement(By.linkText("SIGN-OFF")).click();
		System.out.println("click on signoff");
		break;
	     }
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		}
	}
}

