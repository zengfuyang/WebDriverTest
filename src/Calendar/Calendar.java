package Calendar;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Configure.ConfigureTest;
import Configure.DataProvider;

public class Calendar {
	
	public static void main(String[] args) throws IOException, InterruptedException{
		
		String launchType = DataProvider.getLaunchType();
		String browser = DataProvider.getBrowser();
		String locale = DataProvider.getLocale();
		String remoteURL = DataProvider.getRemoteURL();
		
		WebDriver driver = ConfigureTest.beforeTest(launchType, browser, locale, remoteURL);
		
		driver.get("https://kyfw.12306.cn/otn/leftTicket/init");
		
		Thread.sleep(10000);
		
		WebElement trdate=driver.findElement(By.id("train_date"));
		
		trdate.click();
		
		WebElement ifrirm=driver.findElement(By.xpath("//div[last()]/iframe"));
		
		driver.switchTo().frame(ifrirm);
		
		//WebElement Su = driver.findElement(By.xpath("//tr[calss='MTitle']/td[0]"));
		WebElement Mo =driver.findElement(By.xpath("//tr[@class='MTitle']"));
//		WebElement Tu =driver.findElement(By.xpath("//tr[@class='MTitle']/td[2]"));
//		WebElement We =driver.findElement(By.xpath("//tr[@class='MTitle']/td[3]"));
//		WebElement Th =driver.findElement(By.xpath("//tr[@class='MTitle']/td[4]"));
//		WebElement Fr =driver.findElement(By.xpath("//tr[@class='MTitle']/td[5]"));
//		WebElement Sa =driver.findElement(By.xpath("//tr[@class='MTitle']/td[6]"));
		
		//System.out.println(Su.getText());
		System.out.println(Mo.getText());
//		System.out.println(Tu.getText());
//		System.out.println(We.getText());
//		System.out.println(Th.getText());
//		System.out.println(Fr.getText());
//		System.out.println(Sa.getText());
		
	}

}
