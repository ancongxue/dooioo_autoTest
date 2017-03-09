package com.dooioo.shjiaoyi.pages;

import java.util.Calendar;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;

public class YiXiangPage extends Page{

	public void fillForm(){
		click(By.name("customerDealType"));
		sendKeys(By.xpath("//input[@ng-model='model.customerPersonName']"),"客户姓名");
		click(By.name("customerPersonSex"));
		click(By.name("customerPersonLoan"));
		click(By.linkText("重新获取"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(By.name("customerMobile"));
		click(By.linkText("保存"));
		
		click(By.xpath("//input[@ng-model='model.ownerDealType']"));
		sendKeys(By.xpath("//input[@ng-model='model.ownerPersonName']"),"业主姓名");
		
		sendKeys(By.xpath("//input[@ng-model='model.addPrice']"),"5");
		sendKeys(By.xpath("//input[@ng-model='model.intentHandPrice']"),"500");
		sendKeys(By.xpath("//input[@ng-model='model.intentOwnerCommision']"),"5");
		click(By.xpath("/html/body/div[4]/div[2]/div[3]/table/tbody/tr[5]/td[3]/div/input"));
		click(By.xpath("//td[@class='ng-scope ng-binding selectable_day today selected']"));		
		click(By.linkText("确认"));
		selectByVisibleText(By.xpath("//select[@ng-model='doc.docStyle']"), "非制式文书");
		click(By.xpath("//button[contains(text(),'上传')]"));
		uploadFile();
		
		
		
	}
	
	public void submit(){
		
		click(By.xpath("//a[contains(text(),'提交')]"));
		
	}
}
