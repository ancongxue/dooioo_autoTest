package com.dooioo.login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;

import com.dooioo.config.Config;
import com.dooioo.fatherpage.Page;
import com.dooioo.helper.CookieUtil;

/**
 * 测试环境验证码登陆，并将cookie存储下来
 * 
 * @author ancongxue
 * @since 17/03/03
 */


public class LoginNet extends Page implements Login {

	@Override
	public void  login(String userCode) {
		sendKeys(By.xpath("//input[@id='usercode']"), userCode);
		sendKeys(By.xpath("//input[@id='password']"), "1");

		
		
		//输入验证码
		try {			
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		

		if (driver.findElement(By.id("selectCompanyContainer")).isDisplayed()) {
			
			//判断要登陆的是上海还是苏州
			if (Config.getOrgId().equals("1")){
				driver.findElement(By.xpath("//*[@id='selectCompanyContainer']/label[1]/input")).click();
			}else{
				driver.findElement(By.xpath("//*[@id='selectCompanyContainer']/label[2]/input")).click();
			}
		}
		
		click(By.name("forjy"));
		
		//存cookie
		try {
			new CookieUtil(driver).storeLoginCookie(new File(Config.getNetCookieFolder()+ userCode +".txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
