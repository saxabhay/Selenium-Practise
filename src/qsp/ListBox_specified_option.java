package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_specified_option {

	public static void main(String[] args) {
		System.out.println("option to search");
		Scanner sc = new Scanner(System.in);
		String expected = sc.nextLine();
		sc.close();
		System.out.println("searching...");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/saxabhay/Desktop/html/List_box.html");
		WebElement listbox = driver.findElement(By.id("mtr"));

		Select select = new Select(listbox);

		List<WebElement> alloption = select.getOptions();
		int found = 0;
		for (WebElement option : alloption) {
			String text = option.getText();

			if (text.equals(expected)) {
				found++;
			}
		}
		if (found == 0) {
			System.out.println("no element is present");
		} else if (found == 1) {
			System.out.println("Element is present");
		} else {
			System.out.println("duplicate");
		}
		driver.quit();
	}

}
