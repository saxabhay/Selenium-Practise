package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Numbers {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/saxabhay/Desktop/html/Table.html");
		
		List<WebElement> alltd = driver.findElements(By.xpath("//td"));
		int count=0; 
		int sum=0;
		for(WebElement td:alltd){
			String text = td.getText();
			
			
		try{
		int n = Integer.parseInt(text);
		System.out.println(n);
		count++;
		sum=sum+n;
		}
		catch(Exception e){
			
		}
	}
		System.out.println("count ="+count);
		System.out.println("sum ="+sum);
	}
}
