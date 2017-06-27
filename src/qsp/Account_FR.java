package qsp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Account_FR {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter your new account Email id");
		String emailid = sc.nextLine();
		System.out.println("Enter your Password");
		String password = sc.nextLine();
		sc.close();
		System.out.println("Your FR account is Creating Please Wait...");
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.fr/ap/register?_encoding=UTF8&openid.assoc_handle=frflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.fr%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("ap_customer_name")).sendKeys(name);

		driver.findElement(By.id("ap_email")).sendKeys(emailid);

		driver.findElement(By.id("ap_password")).sendKeys(password);

		driver.findElement(By.id("ap_password_check")).sendKeys(password);

		driver.findElement(By.id("continue")).click();

		WebElement accountlist = driver.findElement(By.id("nav-link-yourAccount"));

		Actions actions = new Actions(driver);

		actions.moveToElement(accountlist).perform();

		driver.findElement(By.xpath("(//span[text()='G�rer votre contenu et vos appareils'])[3]")).click();

		driver.findElement(By.xpath("//div[text()=' Param�tres ']")).click();

		driver.findElement(By.xpath("//span[text()=' Modifier ']")).click();

		WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
		actions.moveToElement(address1).click().sendKeys("3 Rue Jean Bonnichon");
		actions.build().perform();

		/*
		 * WebElement address2 = driver.findElement(By.id("adr_AddressLine2"));
		 * actions.moveToElement(address2).click().sendKeys("Andover Court");
		 * actions.build().perform();
		 */

		WebElement city = driver.findElement(By.id("adr_City"));
		actions.moveToElement(city).click().sendKeys("Desertines");
		actions.build().perform();

		WebElement state = driver.findElement(By.id("adr_StateOrRegion"));
		actions.moveToElement(state).click().sendKeys("Mayenne");
		actions.build().perform();

		WebElement zip = driver.findElement(By.id("adr_PostalCode"));
		actions.moveToElement(zip).click().sendKeys("03630");
		actions.build().perform();

		WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
		actions.moveToElement(phone).click().sendKeys("1234567890");
		actions.build().perform();

		WebElement update = driver.findElement(By.xpath("//span[text()=' Mettre � jour ']"));
		actions.moveToElement(update).click();
		actions.build().perform();

		Thread.sleep(5000);

		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()=' Modifier le mode de paiement ']")).click();

		driver.findElement(By.xpath("//span[text()='Utiliser cette adresse']")).click();

		driver.findElement(By.xpath("//span[text()='Ajouter une carte']")).click();

		driver.findElement(By.name("addCreditCardNumber")).sendKeys("4111111111111111");

		driver.findElement(By.name("accountHolderName")).sendKeys("tester");

		driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]")).click();

		driver.findElement(By.linkText("2019")).click();
		
		driver.findElement(By.name("addCreditCardVerificationNumber")).sendKeys("000");

		driver.findElement(By.xpath("//button[text()='Ajouter votre carte']")).click();

		driver.findElement(By.xpath("//span[text()='Utiliser cette adresse']")).click();

		driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'pmts-id-')])[2]")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.get("https://www.amazon.fr/gp/internal/repeat/du/handle.html?action=cust-id");

		WebElement text = driver.findElement(By.tagName("body"));

		String ecid = text.getText();

		// System.out.println(ecid);

		String ECID = ecid.substring(19, 33);
		// System.out.println(ECID);

		driver.get("https://maswhitelisting.amazon.com");

		driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

		driver.findElement(By.id("cx_request_agreement")).click();

		driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

		WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
		date.click();

		driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
		String expdate = date.getAttribute("value");
		driver.findElement(By.id("cx_request_whitelist_ids_")).click();

		driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

		driver.findElement(By.xpath("(//li[text()='FR'])[1]")).click();

		driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

		driver.findElement(By.xpath("(//li[text()='FR'])[2]")).click();

		driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

		driver.findElement(By.xpath("(//li[text()='FR'])[3]")).click();

		driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

		Thread.sleep(7000);

		driver.navigate().refresh();

		Thread.sleep(4000);
		driver.quit();
		System.out.println("Your Name = " + name);

		System.out.println("Your New Acoount Email Id = " + emailid);

		System.out.println("Your Password = " + password);

		System.out.println("ECID of " + emailid + " = " + ECID);

		System.out.println("Your Whitelisted acoount Expire Date = " + expdate);

		System.out.println("Your Account is Whitelisted");

	}

}
