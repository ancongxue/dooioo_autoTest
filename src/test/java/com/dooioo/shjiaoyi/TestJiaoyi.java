package com.dooioo.shjiaoyi;



import org.junit.Before;
import org.junit.Test;
import com.dooioo.config.Config;
import com.dooioo.login.CookieLoginPage;

/**
 * 登陆
 * @author ancongxue
 *
 */

public class TestJiaoyi {

	@Before
	//@Test
	public void login(){
		CookieLoginPage lp= new CookieLoginPage(Config.getLoginUrl());
		lp.open();
		lp.login(Config.getUserCode());
	}
	

		
	}

