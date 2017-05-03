package qsp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Hidden_TodayDate {

	public static void main(String[] args) {
		SimpleDateFormat s=new SimpleDateFormat("yyyy_M_d");
		String v = s.format(new Date());
		System.out.println("a_"+v);
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.yatra.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("BE_flight_depart_date")).click();
		
		driver.findElement(By.id("a_"+v)).click();

	}

}
