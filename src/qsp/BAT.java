package qsp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BAT {

	public static void main(String[] args) {
		System.out.println("Device Generation");
		Scanner sc = new Scanner(System.in);
		String gen = sc.nextLine();
		System.out.println("Device Name");
		String devicename = sc.nextLine();
		System.out.println("Market Place");
		String mp = sc.nextLine();
		sc.close();
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://mas-testrail.integ.amazon.com/testrail/index.php?/auth/login/L21pbGVzdG9uZXMvdmlldy8zODAtYmMxZmY1Yzk1YTE5MGExZDkyN2MxYTgwZDliYmEyZGQ3ZDAyMDJjOTQ0NzhiZWZhNDcyZWU5YmM5NWRiNmU5Zg::");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("https://mas-testrail.integ.amazon.com")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("All Projects - TestRail"));
		driver.get(
				"https://mas-testrail.integ.amazon.com/testrail/index.php?/suites/view/73707&group_by=cases:section_id&group_order=asc");
		driver.findElement(
				By.xpath("//a[@class='toolbar-button content-header-button button-responsive button-start']")).click();
		driver.findElement(By.id("name")).clear();
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		String date = s.format(new Date());
		driver.findElement(By.id("name")).sendKeys("[" + date + "]"
				+ "[India Team]BAT(Build Acceptance Test)- Amazon Devices- " + gen + "- " + devicename + " - " + mp);
		driver.findElement(By.id("assignedto_id")).click();
		driver.findElement(By.xpath("//option[text()='Me']")).click();
		driver.findElement(By.id("description")).sendKeys("System Build:" + Keys.ENTER + "AppStore APK Version:"
				+ Keys.ENTER + "Device Name: " + devicename + Keys.ENTER + "Market Place: " + mp);
		driver.findElement(By.id("includeSpecific")).click();
		driver.findElement(By.linkText("change selection")).click();
		driver.findElement(By.xpath("//input[@rel='3317881']")).click();
		driver.findElement(By.xpath("//input[@rel='3317882']")).click();
		driver.findElement(By.xpath("//input[@rel='3456365']")).click();
		driver.findElement(By.xpath("//input[@rel='3317884']")).click();
		driver.findElement(By.xpath("//input[@rel='3317885']")).click();
		driver.findElement(By.xpath("//input[@rel='3317883']")).click();
		driver.findElement(By.xpath("//input[@rel='3453004']")).click();
		driver.findElement(By.xpath("//input[@rel='3317886']")).click();
		driver.findElement(By.xpath("//input[@rel='3317889']")).click();
		driver.findElement(By.xpath("//input[@rel='3317890']")).click();
		driver.findElement(By.xpath("//input[@rel='3317887']")).click();
		driver.findElement(By.xpath("//input[@rel='3456380']")).click();
		driver.findElement(By.xpath("//input[@rel='3763953']")).click();
		driver.findElement(By.xpath("//input[@rel='3459932']")).click();
		driver.findElement(By.xpath("//input[@rel='3317891']")).click();
		driver.findElement(By.xpath("//input[@rel='3426160']")).click();
		driver.findElement(By.xpath("//input[@rel='3426161']")).click();
		driver.findElement(By.xpath("//input[@rel='3426159']")).click();
		driver.findElement(By.xpath("//input[@rel='3426163']")).click();
		driver.findElement(By.xpath("//input[@rel='3426164']")).click();
		driver.findElement(By.xpath("//input[@rel='3715897']")).click();
		driver.findElement(By.xpath("//input[@rel='3317888']")).click();
		driver.findElement(By.id("selectCasesSubmit")).click();
		System.out.println("Your Test Link is Created");
	}
	

}
