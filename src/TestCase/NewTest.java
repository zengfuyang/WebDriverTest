package TestCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import Configure.ConfigureTest;
import Configure.DataProvider;
import TestNG.LoginTest;

public class NewTest {
	
	WebDriver webdriver;
	static Logger logger = LogManager.getLogger(LoginTest.class.getName());
	DataProvider dp=new DataProvider();
	
	@Test
  	public void f() {
		webdriver.get("http://baidu.com");
  	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		String launchType = DataProvider.getLaunchType();
		String browser = DataProvider.getBrowser();
		String locale = DataProvider.getLocale();
		String remoteURL = DataProvider.getRemoteURL();
		
		webdriver=ConfigureTest.beforeTest(launchType, browser, locale, remoteURL);
	}

	@AfterMethod
	public void afterMethod() {
		webdriver.quit();
	}

}
