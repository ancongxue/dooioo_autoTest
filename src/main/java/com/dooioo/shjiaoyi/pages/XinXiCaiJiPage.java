package com.dooioo.shjiaoyi.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;

/**
 * 信息采集表页面
 * @author ancongxue
 *
 * 
 */


public class XinXiCaiJiPage extends Page{
	public void fillForm(){
		
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.houseType']"),"商用");
		click(By.linkText("上传"));
		click(By.xpath("//div[@attach-list='certificateOfTitleAttachList']/button"));
		uploadFile();
		click(By.xpath("//*[@id='CQZSFollowLayer']/div[1]/div/a"));
		
		click(By.xpath("//a[@ng-show='chandiaoAttachList.length == 0 ']"));
		click(By.xpath("//div[@attach-list='chandiaoAttachList']/button"));
		uploadFile();
		click(By.xpath("//*[@id='CDFollowLayer']/div[1]/div/a"));
		
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.district']"),"静安");
		sendKeys(By.xpath("//input[@placeholder='产证地址']"),"产证地址");
		sendKeys(By.xpath("//input[@placeholder='车位地址（若有）']"),"车位地址");
		
		click(By.xpath("//div[@date='infoHouse.propertyRegisterDate']/input"));
		click(By.xpath("//td[contains(text(),'15')]"));
		
		sendKeys(By.xpath("//input[@ng-model='infoHouse.certificateNo']"),"产证编号");
		sendKeys(By.xpath("//input[@ng-model='infoHouse.acreage']"),"100");
		
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.houseLevel']"),"内环内");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.buildYear']"),"2020");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.passwordStatus']"),"无");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.certificateType']"),"个人");
		
		sendKeys(By.xpath("//input[@ng-model='o.realName']"),"产权人姓名");
		selectByVisibleText(By.xpath("//select[@ng-model='o.gender']"),"男");
		selectByVisibleText(By.xpath("//select[@ng-model='o.adult']"),"成年");
		selectByVisibleText(By.xpath("//select[@ng-model='o.hukouStatus']"),"香港人");
		selectByVisibleText(By.xpath("//select[@ng-model='o.idType']"),"护照");
		sendKeys(By.xpath("//input[@ng-model='o.idNo']"),"888888888888");
		click(By.xpath("//a[@ng-show='o.certificateOwnerAttachList.length == 0']"));
		click(By.xpath("//div[@attach-list='cqrAttachmentList']/button"));
		uploadFile();
		click(By.xpath("//*[@id='CQRFollowLayer']/div[1]/div/a"));
		
		sendKeys(By.xpath("//input[@ng-model='infoHouse.nickName']"),"产权人称谓");
		sendKeys(By.xpath("//input[@ng-model='infoHouse.telephone']"),"15888888888");
		sendKeys(By.xpath("//input[@ng-model='infoHouse.address']"),"产权人通讯地址");
		
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.onlyOneStatus']"),"唯一");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.certificateGetWays']"),"买卖");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.propertyAge']"),"满五");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.unnaturalDeathStatus']"),"否");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.invoiceType']"),"未提供");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.contractTaxType']"),"未提供");
		selectByVisibleText(By.xpath("//select[@ng-model='infoHouse.mortgageStatus']"),"未设立抵押");
		click(By.name("rentStatus"));
		
		click(By.linkText("客户信息"));
		selectByVisibleText(By.xpath("//select[@ng-model='infoCustomer.customerType']"),"个人");
		selectByVisibleText(By.xpath("//select[@ng-model='infoCustomer.isLoanMoney']"),"不贷款");
		
		sendKeys(By.xpath("/html/body/div[3]/div/div[2]/div[4]/table/tbody/tr[3]/td[3]/table"
				+ "/tbody/tr[1]/td[1]/input"),"买受人姓名");
		selectByVisibleText(By.xpath("/html/body/div[3]/div/div[2]/div[4]/table/tbody/tr[3]"
				+ "/td[3]/table/tbody/tr[1]/td[2]/select"),"女");
		selectByVisibleText(By.xpath("/html/body/div[3]/div/div[2]/div[4]/table/tbody"
				+ "/tr[3]/td[3]/table/tbody/tr[1]/td[3]/select"),"护照");
		sendKeys(By.xpath("/html/body/div[3]/div/div[2]/div[4]/table/tbody/"
				+ "tr[3]/td[3]/table/tbody/tr[1]/td[4]/input"),"88888888");
		click(By.linkText("上传"));
		click(By.xpath("//div[@attach-list='msfAttachmentList']/button"));
		uploadFile();
		click(By.xpath("//*[@id='MSFFollowLayer']/div[1]/div/a"));
		selectByVisibleText(By.xpath("/html/body/div[3]/div/div[2]/div[4]/table/"
				+ "tbody/tr[3]/td[3]/table/tbody/tr[2]/td[1]/select"),"香港人");
		selectByVisibleText(By.xpath("/html/body/div[3]/div/div[2]/div[4]/table/"
				+ "tbody/tr[3]/td[3]/table/tbody/tr[2]/td[2]/select"),"未成年");
		
		sendKeys(By.xpath("//input[@ng-model='infoCustomer.nickName']"),"客户称谓");
		sendKeys(By.xpath("//input[@ng-model='infoCustomer.telephone']"),"15988888888");
		sendKeys(By.xpath("//input[@ng-model='infoCustomer.address']"),"客户通讯地址");
		
		selectByVisibleText(By.xpath("//select[@ng-model='infoCustomer.distributeWays']"),"共同共有");
		
		sendKeys(By.xpath("//textarea[@ng-model='infoCustomer.existingHouse']"),"具体的名下住房情况");
		
		
		
	}
	
	public void submit(){
		
		click(By.linkText("暂存"));
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div[2]/a[2]"));
		click(By.linkText("关闭"));
		
	}
}
