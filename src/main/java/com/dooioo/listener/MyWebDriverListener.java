package com.dooioo.listener;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.dooioo.login.VCodeLoginPage;

/**
 * 监听是否登陆成功
 * 
 * @author ancongxue
 * @since 17/03/03
 */


public class MyWebDriverListener implements org.openqa.selenium.support.events.WebDriverEventListener {

	private String userCode;
	
	public MyWebDriverListener(String userCode) {
		super();
		this.userCode = userCode;
	}

	/**
	 * 若跳转后仍在登陆页面，说明登陆失败，将按验证码方式进行登陆。
	 * 
	 * 登陆失败原因可能有：
	 * 1. cookie已过期，添加cookie并没有绕过登陆
	 * 2. 采用一般的登陆方式时，验证码输入有误
	 */
	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
	
		if (driver.getCurrentUrl().contains("//login.dooioo.")) {
			
			new VCodeLoginPage(url).login(userCode);
			
		}
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

}
