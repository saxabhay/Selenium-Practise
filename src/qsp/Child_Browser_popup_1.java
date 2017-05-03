package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Browser_popup_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.get("https://www.naukri.com");
		Set<String> allWh = driver.getWindowHandles();
		System.out.println(allWh.size()); 
		
		for(String wh:allWh){
			System.out.println(wh);
		}
		
		

	}

}
