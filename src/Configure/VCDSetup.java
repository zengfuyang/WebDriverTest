package Configure;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class VCDSetup {
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException{
		
		String launchType = DataProvider.getLaunchType();
		String browser = DataProvider.getBrowser();
		String locale = DataProvider.getLocale();
		String remoteURL = DataProvider.getRemoteURL();
		
		WebDriver wd=ConfigureTest.beforeTest(launchType, browser, locale, remoteURL);
	
		Robot rb = new Robot();
	
		int x=900;
		int y= 400;
		Dimension dim=new Dimension(1024, 768);
		Point point=new Point(0, 0);
	
		DataProvider dp=new DataProvider();
		wd.get(dp.getvCDURL());
		wd.manage().window().setSize(dim);
		wd.manage().window().setPosition(point);
	
		Thread.sleep(15000);
		rb.mouseMove(x, y);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		System.out.println("点下一步");
		Thread.sleep(5000);
	
		if(dp.getBrowser().equalsIgnoreCase("firefox")){
			rb.mouseMove(244, 669);
			rb.mousePress(InputEvent.BUTTON1_MASK);
			rb.mouseRelease(InputEvent.BUTTON1_MASK);
			System.out.println("点是");
		}else if(dp.getBrowser().equalsIgnoreCase("chrome")){
			rb.mouseMove(289, 668);
			rb.mousePress(InputEvent.BUTTON1_MASK);
			rb.mouseRelease(InputEvent.BUTTON1_MASK);
			System.out.println("点是");
		}else if(dp.getBrowser().equalsIgnoreCase("ie")){
			rb.mouseMove(244, 668);
			rb.mousePress(InputEvent.BUTTON1_MASK);
			rb.mouseRelease(InputEvent.BUTTON1_MASK);
			System.out.println("点是");
		}
	
		Thread.sleep(5000);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		System.out.println("点下一步");
	
		Thread.sleep(5000);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		Thread.sleep(5000);
	
		//Press "H"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "M"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "4"
		rb.keyPress(KeyEvent.VK_4);
		rb.keyRelease(KeyEvent.VK_4);
	
		//Press "T"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "H"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "-" #########################################################################
		rb.keyPress(KeyEvent.VK_MINUS);
		rb.keyRelease(KeyEvent.VK_MINUS);

		//Press "A"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "9"
		rb.keyPress(KeyEvent.VK_9);
		rb.keyRelease(KeyEvent.VK_9);
	
		//Press "K"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "4"
		rb.keyPress(KeyEvent.VK_4);
		rb.keyRelease(KeyEvent.VK_4);
	
		//Press "5"
		rb.keyPress(KeyEvent.VK_5);
		rb.keyRelease(KeyEvent.VK_5);
	
		//Press "-" #########################################################################
		rb.keyPress(KeyEvent.VK_MINUS);
		rb.keyRelease(KeyEvent.VK_MINUS);
	
		//Press "4"
		rb.keyPress(KeyEvent.VK_4);
		rb.keyRelease(KeyEvent.VK_4);
	
		//Press "8"
		rb.keyPress(KeyEvent.VK_8);
		rb.keyRelease(KeyEvent.VK_8);
	
		//Press "R"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "F"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_F);
		rb.keyRelease(KeyEvent.VK_F);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "3"
		rb.keyPress(KeyEvent.VK_3);
		rb.keyRelease(KeyEvent.VK_3);
	
		//Press "-" #########################################################################
		rb.keyPress(KeyEvent.VK_MINUS);
		rb.keyRelease(KeyEvent.VK_MINUS);
	
		//Press "0"
		rb.keyPress(KeyEvent.VK_0);
		rb.keyRelease(KeyEvent.VK_0);
	
		//Press "L"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "0"
		rb.keyPress(KeyEvent.VK_0);
		rb.keyRelease(KeyEvent.VK_0);
	
		//Press "K"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "M"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "-" #########################################################################
		rb.keyPress(KeyEvent.VK_MINUS);
		rb.keyRelease(KeyEvent.VK_MINUS);
	
		//Press "C"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "0"
		rb.keyPress(KeyEvent.VK_0);
		rb.keyRelease(KeyEvent.VK_0);
	
		//Press "3"
		rb.keyPress(KeyEvent.VK_3);
		rb.keyRelease(KeyEvent.VK_3);
	
		//Press "J"
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_J);
		rb.keyRelease(KeyEvent.VK_J);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		//Press "6"
		rb.keyPress(KeyEvent.VK_6);
		rb.keyRelease(KeyEvent.VK_6);
	
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		System.out.println("点下一步");
	
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
	
		//password 123456
		rb.keyPress(KeyEvent.VK_1);
		rb.keyRelease(KeyEvent.VK_1);
		rb.keyPress(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_2);
		rb.keyPress(KeyEvent.VK_3);
		rb.keyRelease(KeyEvent.VK_3);
		rb.keyPress(KeyEvent.VK_4);
		rb.keyRelease(KeyEvent.VK_4);
		rb.keyPress(KeyEvent.VK_5);
		rb.keyRelease(KeyEvent.VK_5);
		rb.keyPress(KeyEvent.VK_6);
		rb.keyRelease(KeyEvent.VK_6);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		//type again 123456
		rb.keyPress(KeyEvent.VK_1);
		rb.keyRelease(KeyEvent.VK_1);
		rb.keyPress(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_2);
		rb.keyPress(KeyEvent.VK_3);
		rb.keyRelease(KeyEvent.VK_3);
		rb.keyPress(KeyEvent.VK_4);
		rb.keyRelease(KeyEvent.VK_4);
		rb.keyPress(KeyEvent.VK_5);
		rb.keyRelease(KeyEvent.VK_5);
		rb.keyPress(KeyEvent.VK_6);
		rb.keyRelease(KeyEvent.VK_6);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		//name a
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
	
		rb.keyPress(KeyEvent.VK_TAB);
	
		//email a@b.com
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_SHIFT);
	
		rb.keyPress(KeyEvent.VK_B);
		rb.keyRelease(KeyEvent.VK_B);
	
		rb.keyPress(KeyEvent.VK_DECIMAL);
		rb.keyRelease(KeyEvent.VK_DECIMAL);
	
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
	
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
	
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
	
		Thread.sleep(5000);
	
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		System.out.println("点下一步");

		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
	
		//vcd name vcd
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
	
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
	
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
	
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		System.out.println("点下一步");	
	
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	
		Thread.sleep(5000);
		//rb.keyPress(KeyEvent.VK_ENTER);
		System.out.println("点完成");
	}

}

