package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Browser_popup_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	String parent = driver.getWindowHandle();
	driver.get("https://www.naukri.com");
	
	Set<String> allwh = driver.getWindowHandles();
	
	allwh.remove(parent);
	
	for(String wh:allwh){
		driver.switchTo().window(wh);
		driver.close();
	}

	}

}
