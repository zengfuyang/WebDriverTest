package Configure;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataProvider {
	
	static Properties pro=new Properties();
	public static Properties readDate() throws IOException{
		
		try{
			
			InputStream is=new FileInputStream("src/DataProvider.properties");
			InputStreamReader isr=new InputStreamReader(is,"UTF-8");
			pro.load(isr);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		return pro;
	}
	
	public static String readDate(String file, String key) throws IOException{
		
		try{
			
			InputStream is=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(is,"UTF-8");
			pro.load(isr);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		return pro.getProperty(key);
	}
	
	
	
	public static String getLocale() throws IOException{
		
		return readDate().getProperty("Locale");
	}
	
	public static String getRemoteURL() throws IOException{
		
		return readDate().getProperty("RemoteURL");
	}
	
	public static String getvCDURL() throws IOException{
		
		return readDate().getProperty("vCDURL");
	}
	
	public static String getvCDUserName() throws IOException{
		
		return readDate().getProperty("vCDUserName");
	}
	
	public static String getvCDPassword() throws IOException{
		
		return readDate().getProperty("vCDPassword");
	}
	
	public static String getBrowser() throws IOException{
		
		return readDate().getProperty("Browser");
	}
	
	public static String getLaunchType() throws IOException{
		
		return readDate().getProperty("LaunchType");
	}
	
	public static String getvCDWrongUserName() throws IOException{
		
		return readDate().getProperty("vCDWrongUserName");
	}
	
	public static String getvCDWrongPassword() throws IOException{
		
		return readDate().getProperty("vCDWrongPassword");
	}
	
	public static String getSVAURL() throws IOException{
		
		return readDate().getProperty("SVAURL");
	}
	
	public static String getSVALoginUserName() throws IOException{
		
		return readDate().getProperty("SVALoginUserName");
	}
	
	public static String getSVALoginPassword() throws IOException{
		
		return readDate().getProperty("SVALoginPassword");
	}
	
	public static String getSVANewDirectoryName() throws IOException{
		
		return readDate().getProperty("SVANewDirectoryName");
	}
	
	public static String getSVABinPassword() throws IOException{
		
		return readDate().getProperty("SVABinPassword");
	}
	
	public static String getSVALoginUserFirstName() throws IOException{
		
		return readDate().getProperty("SVALoginUserFirstName");
	}
	
	public static String getSVAloginUserLastName() throws IOException{
		
		return readDate().getProperty("SVAloginUserLastName");
	}


}
