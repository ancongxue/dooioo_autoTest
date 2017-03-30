package com.dooioo.shjiaoyi.pages;

import org.openqa.selenium.By;

import com.dooioo.config.Config;
import com.dooioo.fatherpage.Page;


public class ViewCasePage extends Page{

	public ViewCasePage(String caseNo){
		super(Config.getJiaoyiUrl()+ "/order/viewCase?caseNo="+ caseNo);
	}
	public void luYiXiang(){
		click(By.xpath("//a[contains(text(),'录意向')]"));
		YiXiangPage yx= new YiXiangPage();
		yx.fillForm();
		yx.submit();
	
		
	}
	
	public void luZhuanDing(){
		click(By.linkText("录转定"));
		ZhuanDingPage lzd =new ZhuanDingPage();
		lzd.fillForm();
		lzd.submit();
		
	}
	
	public void xinXiCaiJi(){
		click(By.linkText("开始填写"));
		XinXiCaiJiPage xx= new XinXiCaiJiPage();
		SwitchTabToLast();
		xx.fillForm();
		xx.submit();
		
	}
	
	public void qianYue(){
		click(By.linkText("预约签约"));
	}
	
}
