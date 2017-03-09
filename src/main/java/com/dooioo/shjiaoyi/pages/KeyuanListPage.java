package com.dooioo.shjiaoyi.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;
import com.dooioo.helper.TelNumGenerator;


public class KeyuanListPage extends Page {
	
	public KeyuanListPage(String url){
		super(url);

	}
	//添加客户，返回客源编�?
	public String addCustomer(){
		
		click(By.linkText("添加客户"));
		SwitchTabToLast();
		click(By.xpath("//input[@ng-model='inquiry.flagPrivate']"));
		click(By.xpath("//input[@ng-model='inquiry.status']"));
		click(By.xpath("//input[@value='驻守']"));
		sendKeys(By.xpath("//input[@ng-model='contact.custName']"),"客户姓名");
		sendKeys(By.xpath("//input[@ng-model='contact.custTel']"),TelNumGenerator.getTel());
		click(By.xpath("//button[contains(text(),'提交')]"));
		click(By.linkText("提交"));
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'客源编号')]")).getText().substring(5,12));
		return driver.findElement(By.xpath("//span[contains(text(),'客源编号')]")).getText().substring(5,12);
		
	}
	

}
