package com.dooioo.fatherpage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.dooioo.config.Config;
import com.dooioo.factory.DriverFactory;
import com.dooioo.helper.DriverHelper;

/**
 * 页面的公共父类
 * 提供一些页面共有的操作，例如点击、上传附件、打开网址、切换窗口等
 * 
 * @author ancongxue
 *
 */

public abstract class Page {
	protected ChromeDriver driver;
	protected String url;

	public Page() {
		this.driver = DriverFactory.getDriver();
	}

	public Page(String url) {
		this();
		this.url = url;
	}

	public void open() {
		driver.get(url);
	}
	
	public void SwitchTabByNum(int i){
		driver = DriverHelper.switchByNum(i);
	}
	
	public void SwitchTabToLast(){
		driver= DriverHelper.switchToLast();
	}
	
	public void click(By by) {
		driver.findElement(by).click();
	}

	public void sendKeys(By by, String content) {
		driver.findElement(by).sendKeys(content);
	}

	public ChromeDriver getDriver() {
		return driver;
	}

	public void setDriver(ChromeDriver driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void uploadFile() {
		try {
			Runtime.getRuntime().exec(Config.getUploadFileExe());
				Thread.sleep(2000);
		} catch (IOException e) {
			e.printStackTrace();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectByVisibleText(By by, String visibletext) {
		new Select(driver.findElement(by)).selectByVisibleText(visibletext);
	}

}
