package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Compare_Sorted_Verify {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/saxabhay/Desktop/html/List_box.html");

		WebElement listbox = driver.findElement(By.id("mtr"));

		Select select = new Select(listbox);

		List<WebElement> alloption = select.getOptions();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();

		for (WebElement option : alloption) {
			String text = option.getText();

			list.add(text);
			list1.add(text);
		}

		Collections.sort(list);
		if (list == list1) {
			System.out.println("Content of list box is sorted");
		} else {
			System.out.println("Content of list box is not sorted");
		}
		driver.quit();
	}

}
