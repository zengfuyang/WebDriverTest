package TestNG.SVA;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import Configure.ConfigureTest;
import Configure.DataProvider;
import Configure.LocalResoure;

public class SVAConsoleTest {
	
	WebDriver wd;
	
  @Test
  public void ConsoleTest() throws InterruptedException, IOException {
	  
	  LocalResoure lr=new LocalResoure();
	  String dashboard=LocalResoure.loadLocalResoure(DataProvider.getLocale()).get("Dashboard");
	  SVA sva=new SVA();
	  wd=sva.console(wd);
	  WebElement dash=wd.findElement(By.id("dashboardLink"));
	  Assert.assertEquals(dash.getText(), dashboard);
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
		String launchType = DataProvider.getLaunchType();
		String browser = DataProvider.getBrowser();
		String locale = DataProvider.getLocale();
		String remoteURL = DataProvider.getRemoteURL();
		
		wd=ConfigureTest.beforeTest(launchType, browser, locale, remoteURL);
  }

  @AfterMethod
  public void afterMethod() {
	  wd.quit();
  }

}
