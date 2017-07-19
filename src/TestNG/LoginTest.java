package TestNG;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.Console;
import java.io.IOException;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.junit.internal.runners.statements.Fail;
import org.openqa.grid.web.servlet.handler.RequestHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Configure.Browsers;
import Configure.ConfigureTest;
import Configure.DataProvider;
import Configure.LocalResoure;
import Configure.Screenshot;
import Configure.SetDriver;

public class LoginTest {
	
	WebDriver wd;
	static Logger logger = LogManager.getLogger(LoginTest.class.getName());
	DataProvider dp=new DataProvider();
	
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
		String launchType = DataProvider.getLaunchType();
		String browser = DataProvider.getBrowser();
		String locale = DataProvider.getLocale();
		String remoteURL = DataProvider.getRemoteURL();
		
		wd=ConfigureTest.beforeTest(launchType, browser, locale, remoteURL);
	  
//	  try{
//		SetDriver setDriver=new SetDriver();
//		wd=setDriver.setDriver();
//		logger.info("The Web Driver setup successfully!");
//	  }catch(Exception e){
//		  logger.error("The Web Driver setup Faild!");
//		  //logger.error(e);
//		  throw new RuntimeException("The The Driver setup Faild! Please check your environment configuration!");
//	  }
  }

  @AfterMethod
  public void afterMethod() {
	  
		  //wd.close();
	      //dp.CaptureScreenshot(login, wd);
		  wd.quit();
  }
  
//  @AfterTest
//  public void getConsoleInfo(){
//	  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//
//  }

  
  @Test
  public void Login() throws IOException, InterruptedException{
	  
	  
	  boolean isSuccessful= false;
	  	try{
	    logger.info("Start to run the Login Test Case on");
		DataProvider dp=new DataProvider();
		
//		SetDriver setDriver=new SetDriver();
//		
//		WebDriver wd=setDriver.setDriver();

		wd.get(dp.getvCDURL());
		wd.manage().window().maximize();
		
		Thread.sleep(15000);

		WebElement ifream=wd.findElement(By.xpath("//*[@id='_ssoFrame']/iframe"));
		wd.switchTo().frame(ifream);
		
		WebElement elementUsser=wd.findElement(By.xpath("//input[@id='userName']"));
		
		WebElement elementPWD=wd.findElement(By.xpath("//input[@id='password']"));

		WebElement elementBut=wd.findElement(By.xpath("//input[@id='loginButton']"));
		
		elementUsser.sendKeys(dp.getvCDUserName());
		elementPWD.sendKeys(dp.getvCDPassword());
			
		Thread.sleep(3000);
			
		elementBut.click();
			
		Thread.sleep(30000);
		String data;
		
		if(dp.getBrowser().equalsIgnoreCase(Browsers.IE.getName())){
			WebElement obj=wd.findElement(By.name("movie"));
			data = obj.getAttribute("value");
			
			Screenshot.CaptureScreenshot("login","Result/Screenshot", wd, DataProvider.readDate("src/DataProvider.properties", "Locale"));
			
			Assert.assertEquals(data, "support/flash/ui-vcloud-app-1.0.0.swf?v=5.1.0.741293");
			isSuccessful=true;
		}else{
			WebElement obj=wd.findElement(By.id("application"));
			data = obj.getAttribute("data");
			
			Screenshot.CaptureScreenshot("login","Result/Screenshot", wd, data);
			
			Assert.assertEquals(data, "https://10.0.70.28/cloud/support/flash/ui-vcloud-app-1.0.0.swf?v=5.1.0.741293");
			isSuccessful=true;
		}
		
		

		//System.out.println(wd.getPageSource());
		
		//Get cookies for web
//        Set<Cookie> cookies = wd.manage().getCookies();
//        String cookieName = cookies.iterator().next().getName();
//        System.out.println(cookieName);
//		
//		Assert.assertEquals(cookieName, "vcloud_session_id");
		
		//wd.close();
//		logger.info("The Login Test Case ran successfully!");
	  	}catch(Exception e){
	  		Assert.fail(e.getMessage(),e);
	  		logger.error("The Login Test Case ran Faild");
	  		logger.error(e);
	  	}finally{
			  
				if(isSuccessful){
					logger.info("The Login Test Case ran successfully!");
				}else{
					logger.error("The Login Test Case ran Faild! This error is from TestNG");
				}
	  	}
	}
  
  @Test
  public void LoginFaild() throws IOException, InterruptedException{
	  
	  boolean isSuccessful= false;
	  try{
	  logger.info("Start to run the Login Faild Test Case");
		DataProvider dp=new DataProvider();
//		SetDriver setDriver=new SetDriver();
//		WebDriver wd=setDriver.setDriver();
		wd.get(dp.getvCDURL());
		wd.manage().window().maximize();
		
		Thread.sleep(15000);
	
		WebElement ifream=wd.findElement(By.xpath("//*[@id='_ssoFrame']/iframe"));
		wd.switchTo().frame(ifream);
		
		WebElement elementUsser=wd.findElement(By.xpath("//input[@id='userName']"));
		
		WebElement elementPWD=wd.findElement(By.xpath("//input[@id='password']"));

		WebElement elementBut=wd.findElement(By.xpath("//input[@id='loginButton']"));
		
		
		elementUsser.sendKeys(dp.getvCDWrongUserName());
		elementPWD.sendKeys(dp.getvCDWrongPassword());
		
		Thread.sleep(15000);
		
		elementBut.click();
		
		Thread.sleep(15000);
		WebElement errorMsg =wd.findElement(By.id("error"));
		
		//System.out.println(errorMsg.getText());
		
		LocalResoure lr=new LocalResoure();
		String errorMsgexcept=LocalResoure.loadLocalResoure(DataProvider.getLocale()).get("Authentication Error");
		
		Screenshot.CaptureScreenshot("loginFaild","Result/Screenshot", wd, DataProvider.readDate("src/DataProvider.properties", "Locale"));
		
		assertEquals(errorMsg.getText(), errorMsgexcept);
		isSuccessful=true;

		//wd.close();
		
	  }catch(Exception e){
		Assert.fail(e.getMessage(),e);
		logger.error("The LoginFaild Test Case ran Faild!");
		logger.error(e);
	  }finally{
		  
			if(isSuccessful){
				logger.info("The LoginFaild Test Case ran successfully!");
			}else{
				logger.error("The LoginFaild Test Case ran Faild! This error is from TestNG");
				
			}
		}
  }
}
