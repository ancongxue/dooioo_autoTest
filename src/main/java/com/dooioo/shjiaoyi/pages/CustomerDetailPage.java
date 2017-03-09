package com.dooioo.shjiaoyi.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;

/**
 * 客源详情页
 * 
 * @author ancongxue
 *
 */


public class CustomerDetailPage extends Page{
	
	/**
	 * 点击"创建案源"按钮创建案源
	 * @param HouseNo
	 * @param certificateAddress
	 */
	
	public void addCase(String HouseNo, String certificateAddress){
		click(By.linkText("创建案源"));
		click(By.id("case_caseSource_tradingType1"));
		click(By.id("case_caseSource_signedType1"));
		sendKeys(By.id("hourseSourceNo"),HouseNo);
		click(By.linkText("获取房源"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sendKeys(By.id("certificateAddress"),certificateAddress);
		
		if(driver.findElement(By.name("ownerPhoneRadio")).isDisplayed()){
			click(By.name("ownerPhoneRadio"));	
		}
		
		click(By.linkText("创建"));
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'案源编号')]")).getText().substring(5));
		
	}

}
