package qsp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UI_Practise extends JFrame implements ActionListener {

	private static final long serialVersionUID = 142149479884157820L;
	private JPanel contentPanel;
	private JTextField passwordField;
	private JTextField emailIDTextField;
	private JLabel marketPlaceLabel;
	final String[] array = { "Select Market Place", "US", "UK", "DE", "JP", "IT", "ES", "FR", "CA", "IN" };
	final JComboBox<Object> comboBox_1;
	JLabel emailLabel;
	JLabel passwordLabel;
	JButton createButton;
	JButton closeButton;
	protected static String name;
	protected static String emailid;
	protected static String mp;
	protected static String password;
	protected static String ECID;
	protected static String expdate;
	private JLabel nameLabel;
	private JTextField nameTextField;

	public static void allinfo(String name, String emailid, String password, String ECID, String expdate) {
		System.out.println("Your Name = " + name);

		System.out.println("Your New Account Email Id = " + emailid);

		System.out.println("Your Password = " + password);

		System.out.println("ECID of " + emailid + " = " + ECID);

		System.out.println("Your Whitelisted Account Expire Date = " + expdate);

		System.out.println("Your Account is Whitelisted");
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					UI_Practise account = new UI_Practise();
					account.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UI_Practise() {

		setTitle("Account Creator V1.0 By ABHAY SAXENA");
		setResizable(false);
		setDefaultCloseOperation(3);
		setBounds(100, 100, 600, 400);

		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		emailLabel = new JLabel("E-mail Id ");
		emailLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		emailLabel.setBackground(new Color(204, 204, 204));
		emailLabel.setBounds(71, 100, 109, 36);
		contentPanel.add(emailLabel);

		passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		passwordLabel.setBackground(new Color(204, 204, 204));
		passwordLabel.setBounds(71, 165, 109, 36);
		contentPanel.add(passwordLabel);

		emailIDTextField = new JTextField();
		emailIDTextField.setFont(new Font("Sylfaen", Font.ITALIC, 13));
		emailIDTextField.setBounds(227, 107, 246, 28);
		contentPanel.add(emailIDTextField);
		emailIDTextField.setColumns(10);

		marketPlaceLabel = new JLabel("Market Place");
		marketPlaceLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		marketPlaceLabel.setBounds(71, 233, 150, 17);
		contentPanel.add(marketPlaceLabel);

		comboBox_1 = new JComboBox<Object>(array);
		comboBox_1.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		comboBox_1.setBounds(261, 230, 121, 28);
		comboBox_1.setEditable(false);
		comboBox_1.setMaximumRowCount(10);
		comboBox_1.setSelectedItem(array[0]);
		contentPanel.add(comboBox_1);

		createButton = new JButton("Create Account");
		createButton.setBounds(71, 297, 153, 44);
		contentPanel.add(createButton);
		createButton.addActionListener(this);

		closeButton = new JButton("Cancel");
		closeButton.setBounds(380, 297, 136, 44);
		contentPanel.add(closeButton);

		nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		nameLabel.setBackground(new Color(204, 204, 204));
		nameLabel.setBounds(71, 42, 109, 36);
		contentPanel.add(nameLabel);

		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Sylfaen", Font.ITALIC, 13));
		nameTextField.setColumns(10);
		nameTextField.setBounds(227, 42, 246, 28);
		contentPanel.add(nameTextField);

		passwordField = new JTextField();
		passwordField.setFont(new Font("Sylfaen", Font.ITALIC, 13));
		passwordField.setColumns(10);
		passwordField.setBounds(227, 165, 246, 28);
		contentPanel.add(passwordField);
		closeButton.addActionListener(this);

	}

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == closeButton) {
			super.dispose();
		}

		if (event.getSource() == createButton) {

			name = nameTextField.getText();
			emailid = emailIDTextField.getText();
			password = passwordField.getText();
			mp = (String) comboBox_1.getSelectedItem();
			super.dispose();
			if (mp.equals("UK")) {
				System.out.println("Your UK account is Creating Please Wait...");
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(
						"https://www.amazon.co.uk/ap/register?_encoding=UTF8&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("ap_customer_name")).sendKeys(name);

				driver.findElement(By.id("ap_email")).sendKeys(emailid);

				driver.findElement(By.id("ap_password")).sendKeys(password);

				driver.findElement(By.id("ap_password_check")).sendKeys(password);

				driver.findElement(By.id("continue")).click();

				WebElement accountlist = driver.findElement(By.id("nav-link-yourAccount"));

				Actions actions = new Actions(driver);

				actions.moveToElement(accountlist).perform();

				driver.findElement(By.xpath("(//span[text()='Manage Your Content and Devices'])[3]")).click();

				driver.findElement(By.xpath("//div[text()=' Settings ']")).click();

				driver.findElement(By.xpath("//span[text()=' Change ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("3 5 Piccadilly Place");
				actions.build().perform();

				WebElement city = driver.findElement(By.id("adr_City"));
				actions.moveToElement(city).click().sendKeys("London");
				actions.build().perform();

				WebElement state = driver.findElement(By.id("adr_StateOrRegion"));
				actions.moveToElement(state).click().sendKeys("GB");
				actions.build().perform();

				WebElement zip = driver.findElement(By.id("adr_PostalCode"));
				actions.moveToElement(zip).click().sendKeys("W1J 0DB");
				actions.build().perform();

				WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
				actions.moveToElement(phone).click().sendKeys("1234567890");
				actions.build().perform();

				WebElement update = driver.findElement(By.xpath("//span[text()=' Update ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(5000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();
				driver.findElement(By.xpath("//span[text()=' Edit Payment Method ']")).click();

				driver.findElement(By.xpath("//span[text()='Use this address']")).click();

				driver.findElement(By.xpath("//span[text()='Add a card']")).click();

				driver.findElement(By.name("addCreditCardNumber")).sendKeys("4111111111111111");

				driver.findElement(By.name("accountHolderName")).sendKeys("tester");

				driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]")).click();

				driver.findElement(By.linkText("2019")).click();

				driver.findElement(By.xpath("//button[text()='Next']")).click();

				driver.findElement(By.xpath("//span[text()='Use this address']")).click();

				driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'pmts-id-')])[2]"))
						.sendKeys(Keys.ENTER);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.co.uk/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

				ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
				expdate = date.getAttribute("value");
				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='UK'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='UK'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='UK'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);
			}

			else if (mp.equals("US")) {
				System.out.println("Your US account is Creating Please Wait...");
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(
						"https://www.amazon.com/ap/register?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_custrec_newcust");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("ap_customer_name")).sendKeys(name);

				driver.findElement(By.id("ap_email")).sendKeys(emailid);

				driver.findElement(By.id("ap_password")).sendKeys(password);

				driver.findElement(By.id("ap_password_check")).sendKeys(password);

				driver.findElement(By.id("continue")).click();

				WebElement accountlist = driver.findElement(By.id("nav-link-accountList"));

				Actions actions = new Actions(driver);

				actions.moveToElement(accountlist).perform();

				driver.findElement(By.xpath("(//span[text()='Manage Your Content and Devices'])[1]")).click();

				driver.findElement(By.xpath("//div[text()=' Settings ']")).click();

				driver.findElement(By.xpath("//span[text()=' Change ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("40 Pacifica");
				actions.build().perform();

				WebElement city = driver.findElement(By.id("adr_City"));
				actions.moveToElement(city).click().sendKeys("Irvine");
				actions.build().perform();

				WebElement state = driver.findElement(By.id("adr_StateOrRegion"));
				actions.moveToElement(state).click().sendKeys("CA");
				actions.build().perform();

				WebElement zip = driver.findElement(By.id("adr_PostalCode"));
				actions.moveToElement(zip).click().sendKeys("92618");
				actions.build().perform();

				WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
				actions.moveToElement(phone).click().sendKeys("1234567890");
				actions.build().perform();

				WebElement update = driver.findElement(By.xpath("//span[text()=' Update ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();
				driver.findElement(By.xpath("//span[text()=' Edit Payment Method ']")).click();

				driver.findElement(By.xpath("//span[text()='Use this address']")).click();

				driver.findElement(By.xpath("//span[text()='Add a card']")).click();

				driver.findElement(By.name("addCreditCardNumber")).sendKeys("4111111111111111");

				driver.findElement(By.name("accountHolderName")).sendKeys("tester");

				driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]")).click();

				driver.findElement(By.linkText("2019")).click();

				driver.findElement(By.xpath("//button[text()='Next']")).click();

				driver.findElement(By.xpath("//span[text()='Use this address']")).click();

				driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'pmts-id-')])[2]"))
						.sendKeys(Keys.ENTER);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.com/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

				ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
				 expdate = date.getAttribute("value");

				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='US'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='US'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='US'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);

			}

			else if (mp.equals("DE")) {
				System.out.println("Your DE account is Creating Please Wait...");
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(
						"https://www.amazon.de/ap/register?_encoding=UTF8&openid.assoc_handle=deflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.de%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("ap_customer_name")).sendKeys(name);

				driver.findElement(By.id("ap_email")).sendKeys(emailid);

				driver.findElement(By.id("ap_password")).sendKeys(password);

				driver.findElement(By.id("ap_password_check")).sendKeys(password);

				driver.findElement(By.id("continue")).click();

				WebElement accountlist = driver.findElement(By.id("nav-link-yourAccount"));

				Actions actions = new Actions(driver);

				actions.moveToElement(accountlist).perform();

				driver.findElement(By.xpath("(//span[text()='Meine Inhalte und Geräte'])[3]")).click();

				driver.findElement(By.xpath("//div[text()=' Einstellungen ']")).click();

				driver.findElement(By.xpath("//span[text()=' Ändern ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("Am Markt 1");
				actions.build().perform();

				WebElement city = driver.findElement(By.id("adr_City"));
				actions.moveToElement(city).click().sendKeys("Bad Hersfeld");
				actions.build().perform();

				WebElement state = driver.findElement(By.id("adr_StateOrRegion"));
				actions.moveToElement(state).click().sendKeys("Hessen");
				actions.build().perform();

				WebElement zip = driver.findElement(By.id("adr_PostalCode"));
				actions.moveToElement(zip).click().sendKeys("36251");
				actions.build().perform();

				WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
				actions.moveToElement(phone).click().sendKeys("1234567890");
				actions.build().perform();

				WebElement update = driver.findElement(By.xpath("//span[text()=' Aktualisieren ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();
				driver.findElement(By.xpath("//span[text()=' Zahlungsweise bearbeiten ']")).click();

				driver.findElement(By.xpath("//span[text()='Diese Adresse verwenden']")).click();

				driver.findElement(By.xpath("//span[text()='Eine Karte hinzufügen']")).click();

				driver.findElement(By.name("addCreditCardNumber")).sendKeys("4111111111111111");

				driver.findElement(By.name("accountHolderName")).sendKeys("tester");

				driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]")).click();

				driver.findElement(By.linkText("2019")).click();

				driver.findElement(By.xpath("//button[text()='Karte hinzufügen']")).click();

				driver.findElement(By.xpath("//span[text()='Diese Adresse verwenden']")).click();

				driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'pmts-id-')])[2]"))
						.sendKeys(Keys.ENTER);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.de/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

				ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
				expdate = date.getAttribute("value");
				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='DE'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='DE'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='DE'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);

			}

			else if (mp.equals("JP")) {
				System.out.println("Your JP account is Creating Please Wait...");
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(
						"https://www.amazon.co.jp/ap/register?_encoding=UTF8&openid.assoc_handle=jpflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.jp%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("ap_customer_name")).sendKeys(name);

				driver.findElement(By.id("ap_customer_name_pronunciation")).sendKeys("1234567890");

				driver.findElement(By.id("ap_email")).sendKeys(emailid);

				driver.findElement(By.id("ap_password")).sendKeys(password);

				driver.findElement(By.id("ap_password_check")).sendKeys(password);

				driver.findElement(By.id("continue")).click();

				WebElement accountlist = driver.findElement(By.id("nav-link-yourAccount"));

				Actions actions = new Actions(driver);

				actions.moveToElement(accountlist).perform();

				driver.findElement(By.xpath("(//span[text()='コンテンツと端末の管理'])[2]")).click();

				driver.findElement(By.xpath("//div[text()=' 設定 ']")).click();

				driver.findElement(By.xpath("//span[text()=' 変更 ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("154-1280, Memambetsu Higashi 1-jo");
				actions.build().perform();

				WebElement address2 = driver.findElement(By.id("adr_AddressLine2"));
				actions.moveToElement(address2).click().sendKeys("Ozora-cho Abashiri-gun");
				actions.build().perform();

				WebElement zip1 = driver.findElement(By.id("adr_PostalCode1"));
				actions.moveToElement(zip1).click().sendKeys("099");
				actions.build().perform();

				WebElement zip2 = driver.findElement(By.id("adr_PostalCode2"));
				actions.moveToElement(zip2).click().sendKeys("2311");
				actions.build().perform();

				WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
				actions.moveToElement(phone).click().sendKeys("1234567890");
				actions.build().perform();

				WebElement update = driver.findElement(By.xpath("//span[text()=' 更新 ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();
				driver.findElement(By.xpath("//span[text()=' お支払い方法を編集 ']")).click();

				driver.findElement(By.xpath("//span[text()='この住所を使用']")).click();

				driver.findElement(By.xpath("//span[text()='カードを追加']")).click();

				driver.findElement(By.name("addCreditCardNumber")).sendKeys("4111111111111111");

				driver.findElement(By.name("accountHolderName")).sendKeys("tester");

				driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]")).click();

				driver.findElement(By.linkText("2019")).click();

				driver.findElement(By.xpath("//button[text()='次へ']")).click();

				driver.findElement(By.xpath("//span[text()='この住所を使用']")).click();

				driver.findElement(By.xpath("//input[contains(@aria-labelledby,'pmts-id-')]")).sendKeys(Keys.ENTER);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.co.jp/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

				ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
				 expdate = date.getAttribute("value");
				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='JP'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='JP'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='JP'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);

			}

			else if (mp.equals("FR")) {
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

				driver.findElement(By.xpath("(//span[text()='Gérer votre contenu et vos appareils'])[3]")).click();

				driver.findElement(By.xpath("//div[text()=' Paramètres ']")).click();

				driver.findElement(By.xpath("//span[text()=' Modifier ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("3 Rue Jean Bonnichon");
				actions.build().perform();

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

				WebElement update = driver.findElement(By.xpath("//span[text()=' Mettre à jour ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

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

				driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'pmts-id-')])[2]"))
						.sendKeys(Keys.ENTER);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.fr/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

			    ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
				 expdate = date.getAttribute("value");
				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='FR'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='FR'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='FR'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);

			}

			else if (mp.equals("IT")) {
				System.out.println("Your IT account is Creating Please Wait...");
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(
						"https://www.amazon.it/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.it%2F%3Fref_%3Dnav_signin&prevRID=BPDZSN1PG06083H21GKJ&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=itflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=itflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("ap_customer_name")).sendKeys(name);

				driver.findElement(By.id("ap_email")).sendKeys(emailid);

				driver.findElement(By.id("ap_password")).sendKeys(password);

				driver.findElement(By.id("ap_password_check")).sendKeys(password);

				driver.findElement(By.id("continue")).click();

				WebElement accountlist = driver.findElement(By.id("nav-link-yourAccount"));

				Actions actions = new Actions(driver);

				actions.moveToElement(accountlist).perform();

				driver.findElement(By.xpath("(//span[text()='I miei contenuti e dispositivi'])[3]")).click();

				driver.findElement(By.xpath("//div[text()=' Impostazioni ']")).click();

				driver.findElement(By.xpath("//span[text()=' Modifica ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("Via Stalingrado 21");
				actions.build().perform();

				WebElement city = driver.findElement(By.id("adr_City"));
				actions.moveToElement(city).click().sendKeys("Bologna");
				actions.build().perform();

				WebElement state = driver.findElement(By.id("adr_StateOrRegion"));
				actions.moveToElement(state).click().sendKeys("Emilia-Romagna");
				actions.build().perform();

				WebElement zip = driver.findElement(By.id("adr_PostalCode"));
				actions.moveToElement(zip).click().sendKeys("40128");
				actions.build().perform();

				WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
				actions.moveToElement(phone).click().sendKeys("1234567890");
				actions.build().perform();

				WebElement update = driver.findElement(By.xpath("//span[text()=' Aggiornare ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();
				driver.findElement(By.xpath("//span[text()=' Modifica la modalità di pagamento ']")).click();

				driver.findElement(By.xpath("//span[text()='Utilizza questo indirizzo']")).click();

				driver.findElement(By.xpath("//span[text()='Aggiungi una carta']")).click();

				driver.findElement(By.name("addCreditCardNumber")).sendKeys("4111111111111111");

				driver.findElement(By.name("accountHolderName")).sendKeys("tester");

				driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]")).click();

				driver.findElement(By.linkText("2019")).click();

				driver.findElement(By.xpath("//button[text()='Successivo']")).click();

				driver.findElement(By.xpath("//span[text()='Utilizza questo indirizzo']")).click();

				driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'pmts-id-')])[2]"))
						.sendKeys(Keys.ENTER);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.it/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

				 ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
				expdate = date.getAttribute("value");
				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='IT'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='IT'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='IT'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);

			}

			else if (mp.equals("ES")) {
				System.out.println("Your ES account is Creating Please Wait...");
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(
						"https://www.amazon.es/ap/register?_encoding=UTF8&openid.assoc_handle=esflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.es%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("ap_customer_name")).sendKeys(name);

				driver.findElement(By.id("ap_email")).sendKeys(emailid);

				driver.findElement(By.id("ap_password")).sendKeys(password);

				driver.findElement(By.id("ap_password_check")).sendKeys(password);

				driver.findElement(By.id("continue")).click();

				WebElement accountlist = driver.findElement(By.id("nav-link-yourAccount"));

				Actions actions = new Actions(driver);

				actions.moveToElement(accountlist).perform();

				driver.findElement(By.xpath("(//span[text()='Gestionar contenido y dispositivos'])[3]")).click();

				driver.findElement(By.xpath("//div[text()=' Ajustes ']")).click();

				driver.findElement(By.xpath("//span[text()=' Cambiar ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("Paseo Reina Elisenda de Montcada, 23");
				actions.build().perform();

				WebElement city = driver.findElement(By.id("adr_City"));
				actions.moveToElement(city).click().sendKeys("Barcelona");
				actions.build().perform();

				WebElement state = driver.findElement(By.id("adr_StateOrRegion"));
				actions.moveToElement(state).click().sendKeys("Barcelona");
				actions.build().perform();

				WebElement zip = driver.findElement(By.id("adr_PostalCode"));
				actions.moveToElement(zip).click().sendKeys("8034");
				actions.build().perform();

				WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
				actions.moveToElement(phone).click().sendKeys("1234567890");
				actions.build().perform();

				WebElement update = driver.findElement(By.xpath("//span[text()=' Actualizar ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();
				driver.findElement(By.xpath("//span[text()=' Editar método de pago  ']")).click();

				driver.findElement(By.xpath("//span[text()='Utilizar esta dirección']")).click();

				driver.findElement(By.xpath("//span[text()='Agregar una tarjeta']")).click();

				driver.findElement(By.name("addCreditCardNumber")).sendKeys("4111111111111111");

				driver.findElement(By.name("accountHolderName")).sendKeys("tester");

				driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]")).click();

				driver.findElement(By.linkText("2019")).click();

				driver.findElement(By.xpath("//button[text()='Siguiente']")).click();

				driver.findElement(By.xpath("//span[text()='Utilizar esta dirección']")).click();

				driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'pmts-id-')])[2]"))
						.sendKeys(Keys.ENTER);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.es/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

				 ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
				 expdate = date.getAttribute("value");
				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='ES'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='ES'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='ES'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);

			}

			else if (mp.equals("CA")) {
				System.out.println("Your CA account is Creating Please Wait...");
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(
						"https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&prevRID=QB3YNASQ0VYH7QM1Z5CC&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=caflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("ap_customer_name")).sendKeys(name);

				driver.findElement(By.id("ap_email")).sendKeys(emailid);

				driver.findElement(By.id("ap_password")).sendKeys(password);

				driver.findElement(By.id("ap_password_check")).sendKeys(password);

				driver.findElement(By.id("continue")).click();

				WebElement accountlist = driver.findElement(By.id("nav-link-yourAccount"));

				Actions actions = new Actions(driver);

				actions.moveToElement(accountlist).perform();

				driver.findElement(By.xpath("//span[text()='Manage Your Content and Devices']")).click();

				driver.findElement(By.xpath("//div[text()=' Settings ']")).click();

				driver.findElement(By.xpath("//span[text()=' Change ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("6363 Millcreek Drive");
				actions.build().perform();

				WebElement city = driver.findElement(By.id("adr_City"));
				actions.moveToElement(city).click().sendKeys("Mississauga");
				actions.build().perform();

				WebElement state = driver.findElement(By.id("adr_StateOrRegion"));
				actions.moveToElement(state).click().sendKeys("Ontario");
				actions.build().perform();

				WebElement zip = driver.findElement(By.id("adr_PostalCode"));
				actions.moveToElement(zip).click().sendKeys("L5N 1L8");
				actions.build().perform();

				WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
				actions.moveToElement(phone).click().sendKeys("1234567890");
				actions.build().perform();

				WebElement update = driver.findElement(By.xpath("//span[text()=' Update ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();
				driver.findElement(By.xpath("//span[text()=' Edit Payment Method ']")).click();

				driver.findElement(By.xpath("//span[text()='Use this address']")).click();

				driver.findElement(By.xpath("//span[text()='Add a card']")).click();

				driver.findElement(By.name("addCreditCardNumber")).sendKeys("4111111111111111");

				driver.findElement(By.name("accountHolderName")).sendKeys("tester");

				driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]")).click();

				driver.findElement(By.linkText("2019")).click();

				driver.findElement(By.xpath("//button[text()='Add your card']")).click();

				driver.findElement(By.xpath("//span[text()='Use this address']")).click();

				driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'pmts-id-')])[2]"))
						.sendKeys(Keys.ENTER);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.ca/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

				 ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
			    expdate = date.getAttribute("value");
				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='CA'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='CA'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='CA'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);
			}

			else if (mp.equals("IN")) {
				System.out.println("Your IN account is Creating Please Wait...");
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(
						"https://www.amazon.in/ap/register/253-5567572-7905465?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.id("ap_customer_name")).sendKeys(name);

				driver.findElement(By.id("ap_use_email")).click();

				driver.findElement(By.id("ap_email")).sendKeys(emailid);

				driver.findElement(By.id("ap_password")).sendKeys(password);

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.findElement(By.id("continue")).submit();

				WebElement accountlist = driver.findElement(By.id("nav-link-yourAccount"));

				Actions actions = new Actions(driver);

				actions.moveToElement(accountlist).perform();

				driver.findElement(By.xpath("(//span[text()='Manage Your Content and Devices'])[2]")).click();

				driver.findElement(By.xpath("//div[text()=' Settings ']")).click();

				driver.findElement(By.xpath("//span[text()=' Change ']")).click();

				WebElement address1 = driver.findElement(By.id("adr_AddressLine1"));
				actions.moveToElement(address1).click().sendKeys("67/149, Pratap Nagar");
				actions.build().perform();

				WebElement city = driver.findElement(By.id("adr_City"));
				actions.moveToElement(city).click().sendKeys("Japiur");
				actions.build().perform();

				WebElement state = driver.findElement(By.id("adr_StateOrRegion"));
				actions.moveToElement(state).click().sendKeys("Rajasthan");
				actions.build().perform();

				WebElement zip = driver.findElement(By.id("adr_PostalCode"));
				actions.moveToElement(zip).click().sendKeys("302033");
				actions.build().perform();

				WebElement phone = driver.findElement(By.id("adr_PhoneNumber"));
				actions.moveToElement(phone).click().sendKeys("1234567890");
				actions.build().perform();

				WebElement update = driver.findElement(By.xpath("//span[text()=' Update ']"));
				actions.moveToElement(update).click();
				actions.build().perform();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.get("https://www.amazon.in/gp/internal/repeat/du/handle.html?action=cust-id");

				WebElement text = driver.findElement(By.tagName("body"));

				String ecid = text.getText();

				ECID = ecid.substring(19, 33);

				driver.get("https://maswhitelisting.amazon.com");

				driver.findElement(By.id("cx_request_ecid_csv")).sendKeys(ECID);

				driver.findElement(By.id("cx_request_agreement")).click();

				driver.findElement(By.id("cx_request_justification")).sendKeys("QA");

				WebElement date = driver.findElement(By.id("cx_request_expiration_date"));
				date.click();

				driver.findElement(By.xpath("//td[contains(@class,'active')]/../td[1]")).click();
				expdate = date.getAttribute("value");
				driver.findElement(By.id("cx_request_whitelist_ids_")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();

				driver.findElement(By.xpath("(//li[text()='IN'])[1]")).click();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[1]")).click();
				driver.findElement(By.xpath("(//li[text()='US'])[1]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();

				driver.findElement(By.xpath("(//li[text()='IN'])[2]")).click();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[2]")).click();
				driver.findElement(By.xpath("(//li[text()='US'])[2]")).click();

				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();

				driver.findElement(By.xpath("(//li[text()='IN'])[3]")).click();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.findElement(By.xpath("(//ul[@class='chosen-choices'])[3]")).click();
				driver.findElement(By.xpath("(//li[text()='US'])[3]")).click();

				driver.findElement(By.xpath("//input[@value='Submit Request']")).click();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}

				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				} catch (Exception e) {

				}
				driver.quit();
				UI_Practise.allinfo(name, emailid, password, ECID, expdate);

			}

			else {

				System.out.println("Please Enter Valid Information");
			}
			JFrame myFrame = new JFrame("Account Created Details");
			myFrame.setVisible(true);
			myFrame.setBounds(50, 50, 800, 800);

			JLabel Name = new JLabel("UserName = "+name);
			Name.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			Name.setBackground(new Color(204, 204, 204));
			Name.setBounds(71, 50, 500, 36);
			myFrame.add(Name);

			JLabel email = new JLabel("E-mail Id = "+emailid);
			email.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			email.setBackground(new Color(204, 204, 204));
			email.setBounds(71, 150, 500, 36);
			myFrame.add(email);

			JLabel pwd = new JLabel("Password = "+password);
			pwd.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			pwd.setBackground(new Color(204, 204, 204));
			pwd.setBounds(71, 250, 500, 36);
			myFrame.add(pwd);

			JLabel ecid = new JLabel("ECID = "+ECID);
			ecid.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			ecid.setBackground(new Color(204, 204, 204));
			ecid.setBounds(71, 350, 500, 36);
			myFrame.add(ecid);

			JLabel map = new JLabel("Market Place = "+mp);
			map.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			map.setBounds(71, 450, 500, 36);
			myFrame.add(map);

			JLabel exp = new JLabel("EXP = "+expdate);
			exp.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			exp.setBackground(new Color(204, 204, 204));
			exp.setBounds(71, 550, 500, 36);
			myFrame.add(exp);
	        
			JLabel blank = new JLabel("");
			blank.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
			blank.setBackground(new Color(204, 204, 204));
			blank.setBounds(71, 470, 500, 36);
			myFrame.add(blank);
			 
		}

	}
}
