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

public class EditDirectiryNameTest {
	
	WebDriver wd;
  @Test
  public void editDirectiryNameTest() throws InterruptedException, IOException {
	  
	  DataProvider dp=new DataProvider();
	  SVA sva=new SVA();
	  wd=sva.editDirectiryName(wd);
	  
	  WebElement ifram=wd.findElement(By.id("WS_ADMIN_IFRAME"));
	  wd.switchTo().frame(ifram);
	  
	  Thread.sleep(10000);
	
	  WebElement directName=wd.findElement(By.xpath("//div[@id='directoriesGrid']/div/div/table/tbody/tr/td/a"));
	  
	  Assert.assertEquals(directName.getText(), dp.getSVANewDirectoryName());
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
