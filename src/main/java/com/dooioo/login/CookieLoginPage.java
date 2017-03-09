package com.dooioo.login;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.dooioo.config.Config;
import com.dooioo.fatherpage.Page;
import com.dooioo.helper.CookieUtil;
import com.dooioo.listener.MyWebDriverListener;

/**
 * 
 * 添加已有的cookie信息，绕过登陆
 * 
 * @author ancongxue
 *
 */

public class CookieLoginPage extends Page {
	
	public CookieLoginPage(String url){
		super(url);
	}
	
	
	public void login(String userCode) {
		
		//尝试添加cookie绕过登陆
		driver.manage().deleteAllCookies();
		
		try {
			if (url.contains("net")) {
				new CookieUtil(driver).addLoginCookie(new File(Config.getNetCookieFolder() + userCode + ".txt"));

		} else {
				new CookieUtil(driver).addLoginCookie(new File(Config.getOrgCookieFolder() + userCode + ".txt"));
		}
		}catch (FileNotFoundException e) {
			//找不到cookie文件，说明userCode.txt未曾创建，则进行一般登陆
			new VCodeLoginPage(url).login(userCode);
			
		}catch(IOException e){
			e.printStackTrace();
		}

		open();
		
		//用监听器判断cookie登陆是否成功，若登陆失败，则再进行一般登陆		
		new MyWebDriverListener(userCode).afterNavigateTo(url, driver);
		
		
	}
	
}
