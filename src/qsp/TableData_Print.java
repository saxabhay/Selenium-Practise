package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableData_Print {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/saxabhay/Desktop/html/Table.html");
		
		List<WebElement> alltr = driver.findElements(By.tagName("tr"));
		for(int i=0;i<alltr.size();i++){
		WebElement tr = alltr.get(i);
		List<WebElement> alltd = tr.findElements(By.tagName("td"));
		for(int j=0;j<alltd.size();j++){
		String text = alltd.get(j).getText();
		System.out.print(text+" ");
		}
		System.out.println();
		}
		
	}

}
