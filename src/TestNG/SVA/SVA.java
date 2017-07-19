package TestNG.SVA;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Configure.DataProvider;

public class SVA {
	
	WebDriver wd;
	
	
	public static WebDriver login(WebDriver wd) throws InterruptedException, IOException{
		
		DataProvider dp=new DataProvider();
		
		wd.get(dp.getSVAURL());
		wd.manage().window().maximize();
		  
		Thread.sleep(10000);
		  
		Select select=new Select(wd.findElement(By.id("userStoreDomain")));
		//select.selectByValue("fuyang.com");
		select.selectByVisibleText("fuyang.com");
		WebElement nextbut=wd.findElement(By.id("userStoreFormSubmit"));
		nextbut.click();
		  
		WebElement username=wd.findElement(By.id("username"));
		WebElement password=wd.findElement(By.id("password"));
		WebElement sign=wd.findElement(By.id("signIn"));
		System.out.println(dp.getSVALoginUserName());
		System.out.println(dp.getSVALoginPassword());
		username.sendKeys(dp.getSVALoginUserName());
		password.sendKeys(dp.getSVALoginPassword());
		  
		Thread.sleep(5000);
		sign.click();
		  
		return wd;
	}
	
	public WebDriver console(WebDriver wd) throws InterruptedException, IOException{
		
		wd=SVA.login(wd);
		
		Thread.sleep(10000);
		
		WebElement usernameStr=wd.findElement(By.id("headerDropDown"));
		usernameStr.click();
		WebElement console=wd.findElement(By.xpath("//a[contains(@href, '/SAAS/admin')]"));
		console.click();
		
		return wd;
	}

	public WebDriver editDirectiryName(WebDriver wd) throws InterruptedException, IOException{
		
		DataProvider dp=new DataProvider();
		SVA sva=new SVA();
		wd=sva.console(wd);
		
		WebElement ident=wd.findElement(By.xpath("//a[contains(@href,'/SAAS/admin/identity')]"));
		ident.click();
		
		Thread.sleep(10000);
		
		WebElement ifram=wd.findElement(By.id("WS_ADMIN_IFRAME"));
		wd.switchTo().frame(ifram);
		
		WebElement directName=wd.findElement(By.xpath("//div[@id='directoriesGrid']/div/div/table/tbody/tr/td/a"));
		directName.click();
		
		Thread.sleep(5000);
		
		WebElement directNameOld=wd.findElement(By.id("directoryName"));
		directNameOld.clear();
		directNameOld.sendKeys(dp.getSVANewDirectoryName());
		
		WebElement binPassword=wd.findElement(By.id("bindPassword"));
		binPassword.clear();
		binPassword.sendKeys(dp.getSVABinPassword());
		
		WebElement saveBtu=wd.findElement(By.id("saveDirectory"));
		saveBtu.click();
		
		Thread.sleep(5000);
		
		wd.navigate().refresh();
		
		return wd;
		
	}
}
