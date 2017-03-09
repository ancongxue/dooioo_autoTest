package com.dooioo.factory;

import org.openqa.selenium.chrome.ChromeDriver;

import com.dooioo.config.Config;

/**
 * 创建driver的工厂
 * 单例
 * @author ancongxue
 *
 */
public class DriverFactory {

	private static ChromeDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", Config.getChromeDriver());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, java.util.concurrent.TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
	}

	public static ChromeDriver getDriver() {
		return driver;
	}

}
