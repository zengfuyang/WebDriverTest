package Configure;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.seleniumhq.jetty7.util.log.Log;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SetDriver {
	
	static WebDriver driver;

	public WebDriver setDriver(String launchType, String browser,String locale,String remoteURL) throws IOException{
		
		//launch the remote browser
		try {
			if(launchType.equalsIgnoreCase("remote")){
				if(browser.equalsIgnoreCase(Browsers.FIREFOX.getName())){
					
					DesiredCapabilities dc = DesiredCapabilities.firefox();
					try{
						System.setProperty("webdriver.firefox.marionette","./geckodrive.exe");
						driver=new RemoteWebDriver(new URL(remoteURL), dc);
						
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}else if(browser.equalsIgnoreCase(Browsers.CHROME.getName())){
					
					DesiredCapabilities dc = DesiredCapabilities.chrome();
					try{
						driver=new RemoteWebDriver(new URL(remoteURL), dc);
						
					}catch(Exception e){
						
						e.printStackTrace();
					}
					
				}else if(browser.equalsIgnoreCase(Browsers.IE.getName())){
					
					DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
					try{
					driver=new RemoteWebDriver(new URL(remoteURL), dc);
					
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

			}//launch the local browser
			else if(launchType.equalsIgnoreCase("local")){
			
				if(browser.equalsIgnoreCase(Browsers.FIREFOX.getName())){
					System.setProperty("webdriver.firefox.marionette","D:\\DevTool\\geckodriver.exe");
					FirefoxProfile profile = new FirefoxProfile();
					
					switch(locale){
					case("zh_CN"):  
						profile.setPreference("intl.accept_languages", "zh_CN");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					case("ja_JP"):
						profile.setPreference("intl.accept_languages", "ja_JP");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					case("fr_FR"):
						profile.setPreference("intl.accept_languages", "fr_FR");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					case("de_DE"):
						profile.setPreference("intl.accept_languages", "de_DE");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					case("ko_KO"):
						profile.setPreference("intl.accept_languages", "ko_KO");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					case("zh_TW"):
						profile.setPreference("intl.accept_languages", "zh_TW");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					case("it_IT"):
						profile.setPreference("intl.accept_languages", "it_IT");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					case("es_ES"):
						profile.setPreference("intl.accept_languages", "es_ES");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					case("en_US"):
						profile.setPreference("intl.accept_languages", "en_US");
						try{
							driver=new FirefoxDriver(profile);
							
						}catch(Exception e){
							
							e.printStackTrace();
						}
						break;
					}
				}
				else if(browser.equalsIgnoreCase(Browsers.CHROME.getName())){
					
					System.setProperty("webdriver.chrome.driver", "F:\\Dev Tool\\chromedriver.exe");
					try{
						driver=new ChromeDriver();
						
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
				else if(browser.equalsIgnoreCase(Browsers.IE.getName())){
				
					
					File file = new File("F:\\Dev Tool\\IEDriverServer.exe");  
					System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					try{
						driver=new InternetExplorerDriver(capabilities);
						
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return driver;
	}
		
	



}
