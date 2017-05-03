package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Sorted {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/saxabhay/Desktop/html/List_box.html");
		WebElement listbox = driver.findElement(By.id("mtr"));

		Select select = new Select(listbox);
		List<WebElement> alloption = select.getOptions();
		ArrayList<String> alltext = new ArrayList<String>();

		for (WebElement option : alloption) {
			String text = option.getText();
			alltext.add(text);
		}
		Collections.sort(alltext);
		for (String text : alltext) {
			System.out.println(text);
		}
		driver.quit();
	}

}
