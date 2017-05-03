package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		TakesScreenshot t=(TakesScreenshot) driver;
		
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("C:/movies/error.png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		driver.quit();

	}

}
