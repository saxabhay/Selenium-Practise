package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Browser_popup_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com");
		
		Set<String> allwh = driver.getWindowHandles();
		
		System.out.println(allwh.size());
		
		for(String wh:allwh){
			driver.switchTo().window(wh);
			System.out.println(wh);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}


	}

}
