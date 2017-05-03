package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Login_Script {

	public static void verifytitle(WebDriver driver, String etitle) {
		String atitle = driver.getTitle();
		driver.manage().window().maximize();
		System.out.println("Expected title=" + etitle);
		System.out.println("Actual title=" + atitle);
		if (atitle.equals(etitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

		Facebook_Login_Script.verifytitle(driver, "Facebook - Log In or Sign Up");

		driver.findElement(By.id("email")).sendKeys("abhaysaxena692@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("abhaysaxena123456");

		driver.findElement(By.id("loginbutton")).click();

		Thread.sleep(10000);
		Facebook_Login_Script.verifytitle(driver, "Facebook");
		driver.quit();
	}
}
