
package com.obsqura.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.obsqura.Exception.NoBrowserFoundException;
import com.obsqura.pages.ContactUsPage;
import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.ListDeliveryBoyPage;
import com.obsqura.pages.ListSubCategoriesPage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageLocationPage;
import com.obsqura.pages.ManagePaymentPage;
import com.obsqura.pages.AddMobileSliderPages;
import com.obsqura.pages.ProductsPage;
import com.obsqura.pages.PushNotificationsPage;
import com.obsqura.utilities.TestProperties;

import context.WebdriverContext;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;
	Properties prop;


	@Parameters({ "browserName" })
	@BeforeMethod
	public void InitializeDriver() throws IOException {
		prop = TestProperties.GetProperties();
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		String Environment = prop.getProperty("Environment");
		String Url = prop.getProperty(Environment);

		if (browserName.equals("Chrome")) {
			driver = WebDriverManager.chromedriver().create();

		}

		else if (browserName.equals("Edge")) {
			driver = WebDriverManager.edgedriver().create();

		} else if (browserName.equals("Firefox")) {
			
			driver = WebDriverManager.firefoxdriver().create();

		} else {
//			System.out.println("Please Choose Correct BrowserName");
			throw new NoBrowserFoundException("Please choose Correct browserName");
		}

		WebdriverContext.setDriver(driver);
		InitializePages();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Url);

	}

	public LoginPage lp;
	public HomePage hp;
	public ProductsPage pp;
	public ExpenseCategoryPage ecp;
	public ListDeliveryBoyPage ldp;
	public ContactUsPage cp;
	public PushNotificationsPage pn;
	public ManageLocationPage mp;
	public ListSubCategoriesPage lc;
	public ManagePaymentPage ep;
	public AddMobileSliderPages am;


	/**
	 * Intialize Globally
	 */
	public void InitializePages() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		pp = new ProductsPage(driver);
		ecp = new ExpenseCategoryPage(driver);
		ldp = new ListDeliveryBoyPage(driver);
		cp = new ContactUsPage(driver);
		pn = new PushNotificationsPage(driver);
		mp = new ManageLocationPage(driver);
		lc = new ListSubCategoriesPage(driver);
		ep = new ManagePaymentPage(driver);
		am = new AddMobileSliderPages(driver);
	}

	@AfterMethod
	public void TearDown() {

		driver.quit();
	}
}
