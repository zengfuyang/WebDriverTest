package Configure;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.cglib.core.ClassNameReader;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	
	public static void CaptureScreenshot(String fileName, String dirName,WebDriver driver, String locale ) throws IOException {
		
	      // String dirName = "Result/Screenshot"; 
		//String filename = Thread.currentThread().getStackTrace()[2].getClassName();
		
	       if (!(new File(dirName).exists())) {
	    	   
	           new File(dirName).mkdirs();
	        }
	       
	       SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
	       String time = sdf.format(new Date());
	       TakesScreenshot tsDriver = (TakesScreenshot) driver;
	       File image = new File(dirName + File.separator + time + "-" + fileName + "-" +locale +".png");
	       tsDriver.getScreenshotAs(OutputType.FILE).renameTo(image);
	       System.out.println("#############");
	}
	
	public static void main(String[] args) throws IOException{
		
		WebDriver driver=new FirefoxDriver();
		
		CaptureScreenshot(null, "Result/Screenshot", driver, "zh_CN");
	}
	

}
