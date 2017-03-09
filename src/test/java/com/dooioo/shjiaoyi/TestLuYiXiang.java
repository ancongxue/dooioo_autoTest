package com.dooioo.shjiaoyi;

import org.junit.Test;

import com.dooioo.config.Config;
import com.dooioo.shjiaoyi.pages.ViewCasePage;

/**
 * 录意向
 * @author ancongxue
 *
 */
public class TestLuYiXiang extends TestJiaoyi {

	@Test
	public void LuYiXiang(){
		ViewCasePage vcp = new ViewCasePage(Config.getCaseNo());
		vcp.open();
		vcp.luYiXiang();
		
	}
	
}
