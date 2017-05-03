package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Grid1 {

	public static void main(String[] args) throws MalformedURLException {
		
		URL nodeurl=new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities d = DesiredCapabilities.chrome();
        d.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(nodeurl,d);
		driver.get("https://www.google.com");
		driver.quit();
	}

}
