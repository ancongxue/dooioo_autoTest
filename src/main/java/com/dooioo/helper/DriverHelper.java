package com.dooioo.helper;


import org.openqa.selenium.chrome.ChromeDriver;
import com.dooioo.factory.DriverFactory;

/**
 * 工具方法
 * @author ancongxue
 *
 */
public class DriverHelper {

	
	/**
	 * 移动到第i个窗口
	 * @param i
	 * @return
	 */
	public static ChromeDriver switchByNum(int i) {
		ChromeDriver driver= DriverFactory.getDriver();
		String[] handles = new String[driver.getWindowHandles().size()]; 
		driver.getWindowHandles().toArray(handles);
		ChromeDriver driver2 = (ChromeDriver) driver.switchTo().window(handles[i-1]);
		return driver2;
	}
	
	/**
	 * 移动到最后一个窗口
	 * @return
	 */
	public static ChromeDriver switchToLast(){
		ChromeDriver driver= DriverFactory.getDriver();
		String[] handles = new String[driver.getWindowHandles().size()]; 
		driver.getWindowHandles().toArray(handles);
		int length= handles.length;
		return (ChromeDriver) driver.switchTo().window(handles[length-1]);
		
	}

}
