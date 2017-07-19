package Configure;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ConfigureTest {
	
	static WebDriver wd;
//	String launchType = DataProvider.getLaunchType();
//	String browser = DataProvider.getBrowser();
//	String locale = DataProvider.getLocale();
//	String remoteURL = DataProvider.getRemoteURL();
	
	public static WebDriver beforeTest(String launchType,String browser,String locale,String remoteURL) throws IOException{
		
		try{
			
			SetDriver sd=new SetDriver();
			wd=sd.setDriver(launchType, browser, locale, remoteURL);
			
		  }catch(Exception e){
			  
			  throw new RuntimeException("The The Driver setup Faild! Please check your environment configuration!");
		  }
		return wd;
	}

}
