package com.dooioo.login;

import com.dooioo.fatherpage.Page;

/**
 * 用输入验证码的方式登陆，一般的登陆方式
 * 
 * @author ancongxue
 * @since 17/03/03
 */

public class VCodeLoginPage extends Page{
	public VCodeLoginPage(String url){
		super(url);		
	}

	public void login(String userCode){
		Login lg= null;
		
		if (url.contains("net")){
			lg = new LoginNet();
		}else{
			lg= new LoginOrg();

		}
		lg.login(userCode);
		
	}
	
		
}
