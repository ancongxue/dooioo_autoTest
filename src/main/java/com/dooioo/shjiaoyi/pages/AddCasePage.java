package com.dooioo.shjiaoyi.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;

/**
 * 添加客户页面
 * @author ancongxue
 *
 */

public class AddCasePage extends Page{
		
	public AddCasePage(String url ){
		super(url+"/v2/inquiry/addCase");

	}
	
	
	//创建二手正常案源
		public void addCase(String houseNo, String customerNo, String certificateAddress ){
			
			sendKeys(By.id("inquiryNo"),customerNo);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			click(By.id("case_caseSource_tradingType1"));
			click(By.id("case_caseSource_signedType1"));
			sendKeys(By.id("hourseSourceNo"),houseNo);
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
