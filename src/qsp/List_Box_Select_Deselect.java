package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box_Select_Deselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/saxabhay/Desktop/html/List_box.html");
		
		WebElement listbox = driver.findElement(By.id("mtr"));
		
		Select select=new Select(listbox);
		
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("Dosa");
		
		if(select.isMultiple()){
		  select.deselectByIndex(0);
		  select.deselectByValue("v");
		  select.deselectByVisibleText("Dosa");
		}
		else{
			System.out.println("sorry");
		}
		
		
	}

}
