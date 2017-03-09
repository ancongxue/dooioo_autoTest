package com.dooioo.shjiaoyi;

import org.junit.Test;

import com.dooioo.config.Config;
import com.dooioo.shjiaoyi.pages.ViewCasePage;

/**
 * 录转定
 * 
 * @author ancongxue
 *
 */

public class TestLuZhuanDing extends TestJiaoyi {

	@Test
	public void LuZhuanDing(){

		ViewCasePage vcp = new ViewCasePage(Config.getCaseNo());
		vcp.open();
		vcp.luZhuanDing();
		
		
	}
}
