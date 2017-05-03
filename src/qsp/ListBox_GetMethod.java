package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_GetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/saxabhay/Desktop/html/List_box.html");
		
		WebElement listbox = driver.findElement(By.id("mtr"));
		
		Select select=new Select(listbox);
		
		List<WebElement> alloption = select.getOptions();
		
		int count = alloption.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++){
		
		String text = alloption.get(i).getText();
		System.out.println(text);
		}
	}

}
