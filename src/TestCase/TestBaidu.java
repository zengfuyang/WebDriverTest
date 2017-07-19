package TestCase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Configure.DataProvider;
import TestNG.LoginTest;

public class TestBaidu {
	
	WebDriver wd;
	static Logger logger = LogManager.getLogger(LoginTest.class.getName());
	DataProvider dp=new DataProvider();
	
	public void beforeMethod(){
		
	}

}
