package com.dooioo.login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;

import com.dooioo.config.Config;
import com.dooioo.fatherpage.Page;
import com.dooioo.helper.CookieUtil;

/**
 * 集成环境登陆，并将cookie存储下来
 * 
 * @author ancongxue
 * @since 17/03/03
 */


public class LoginOrg extends Page implements Login {

		public void login(String userCode) {
			
			driver.get("http://login.dooioo.org");	
			driver.findElement(By.xpath("//input[@id='usercode']")).sendKeys("196757");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");

			if (driver.findElement(By.id("selectCompanyContainer")).isDisplayed()){	
				
					driver.findElement(By.xpath("//*[@id='selectCompanyContainer']/label[1]/input")).click();

			}
			
			//输入验证码
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
			driver.findElement(By.name("forjy")).click();
			//超级验证码登陆
			driver.get("http://login.dooioo.org/superLogin?userCode="+Config.getUserCode()+"&companyId="+Config.getOrgId());	
		
			//存cookie
			try {
				new CookieUtil(driver).storeLoginCookie(new File(Config.getOrgCookieFolder()+ userCode +".txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		}

				
	}


