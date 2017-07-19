package TestNG.SVA;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import Configure.ConfigureTest;
import Configure.DataProvider;
import Configure.SetDriver;

public class SVALoginTest {
	
	WebDriver wd;
	
  @Test
  public void LoginTest() throws InterruptedException, IOException {
	  
	  DataProvider dp=new DataProvider();
	  WebDriver driver=SVA.login(wd);
	  
	  Thread.sleep(5000);
	  
	  WebElement name=driver.findElement(By.id("headerDropDown"));
	  
	  Assert.assertEquals(name.getText(), dp.getSVALoginUserFirstName()+ " "+ dp.getSVAloginUserLastName() + " ▾");
	  
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
