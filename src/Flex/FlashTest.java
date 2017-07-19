package Flex;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.thoughtworks.selenium.FlexUISelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;



public class FlashTest {
	
	public static void main(String[] args) throws InterruptedException{
		
		//利用Selenium 1.0 API, 需要启动selenium server服务
//		DefaultSelenium selenium = new DefaultSelenium("127.0.0.1", 4446, "*iexplore", "http://10.0.70.66/flash/Flex3StyleExplorer.html/"); 
//        selenium.start();
//        Thread.sleep(10000);
//        selenium.open("http://10.0.70.66/flash/Flex3StyleExplorer.html");
//        selenium.windowMaximize();
		
//        FlexUISelenium flexUITester = new FlexUISelenium(selenium, "Flex3StyleExplorer");
//        flexUITester.type("2222").at("_applicationView_TextArea1");
		
		
		//利用WebDriver API
		//System.setProperty("webdriver.chrome.driver", "F:\\Dev Tool\\chromedriver.exe");
		
		File file = new File("F:\\Dev Tool\\IEDriverServer.exe");  
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		WebDriver driver=new InternetExplorerDriver(capabilities);
		//WebDriver driver=new ChromeDriver();
	    //WebDriver driver = new FirefoxDriver();
		
	    driver.manage().window().maximize();
	    String baseUrl ="http://10.0.70.66/flash/Flex3StyleExplorer.html/"; 
	    Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
	    //FlashSelenium flashApp = new FlashSelenium(selenium, "Flex3StyleExplorer");
	    FlexUISelenium flexUITester = new FlexUISelenium(selenium, "FlexDemo");
	    
	    // 执行selenium命令
	    selenium.open("file:///F:/Adobe%20Flash%20Builder%204/FlexDemo/bin-debug/FlexDemo.html");
	    //selenium.windowMaximize();
	    Thread.sleep(15000);
	    //flexUITester.at("cp1");
	    //flexUITester.click("cp1");
	    flexUITester.type("zengfuyang").at("textDisplay");
	    flexUITester.click("b");
	    String s=flexUITester.readFrom("textDisplay");
	    System.out.println(s);
	}

}
