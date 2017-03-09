package com.dooioo.shjiaoyi;

import org.junit.Test;

import com.dooioo.config.Config;
import com.dooioo.shjiaoyi.pages.ViewCasePage;

/**
 * 信息采集
 * @author ancongxue
 *
 */
public class TestXinXinCaiJi extends TestJiaoyi {
	
	@Test
	public void xinXiCaiJi(){
		
		ViewCasePage vcp = new ViewCasePage(Config.getCaseNo());
		vcp.open();
		vcp.xinXiCaiJi();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
