package com.dooioo.szjiaoyi.pages;

import org.openqa.selenium.By;
import com.dooioo.fatherpage.Page;

/**
 * 信息采集表填写页面
 * @author ancongxue
 *
 */

public class XinXiCaiJiPage extends Page {


	public void fillForm() throws Exception {

		// 产权信息
		click(By.xpath("//a[@ng-click='showQSXXDJBLayerFunc()']"));
		click(By.xpath("//div[@attach-list='house.qsxxdjbAttachmentList']/button"));
		uploadFile();
		Thread.sleep(6000);
		click((By.xpath("//span[@ng-click='helper.showQSXXDJBLayer = !helper.showQSXXDJBLayer']")));
		// 产权地址
		click((By.xpath("//*[@ng-model='house.district']/div[1]/input")));
		click((By.xpath("//*[@ng-model='house.district']/div[2]/div[2]")));
		sendKeys((By.xpath("//input[@ng-model='house.propertyRightAddress']")), "产权地址");
		// 是否为装修房
		click((By.xpath("//input[@ng-model='house.decorated'][@value='1']")));
		click((By.xpath("//a[@ng-click='showZXQDLayerFunc()']")));
		click((By.xpath("//div[@attach-list='house.zxwpqdAttachmentList']/button")));
		uploadFile();
		Thread.sleep(6000);
		click((By.xpath("//span[@ng-click='helper.showZXQDLayer = !helper.showZXQDLayer']")));
		// 资金托管�?
		sendKeys((By.xpath("//input[@ng-model='house.capitalTrustPrice']")), "500000");
		// 产权人�?�质
		Thread.sleep(1000);
		click((By.xpath("//div[@ng-model='house.propertyRightOwnerType']/div[1]/input[@value='请选择']")));
		click((By.xpath("//div[@ng-model='house.propertyRightOwnerType']/div[2]/div[contains(text(),'个人')]")));
		click((By.xpath("//div[@ng-model='house.propertyRightOwnerTypeCount']/div[1]/input")));
		click((By.xpath("//div[@ng-model='house.propertyRightOwnerTypeCount']/div[2]/div[2]")));
		// 主联系人
		sendKeys((By.xpath("//input[@ng-model='house.contractName']")), "主联系人");
		sendKeys((By.xpath("//input[@ng-model='house.contractPhone']")), "18516560506");
		// 产权�?1
		sendKeys((By.xpath("//input[@ng-model='propertyOwner.realName']")), "姓名");
		click((By.xpath("//input[@ng-model='propertyOwner.gender'][@value='56']")));
		click((By.xpath("//input[@ng-model='propertyOwner.adult'][@value='1']")));
		click((By.xpath("//div[@ng-model='propertyOwner.huKouType']/div[1]/input")));
		click((By.xpath("//div[@ng-model='propertyOwner.huKouType']/div[2]/div[2]")));
		click((By.xpath("//a[@ng-click='showCqrsfzjLayerFunc(propertyOwner)']")));
		click((By.xpath("//div[@attach-list='file.cqrsfzjAttachmentList']/button")));
		uploadFile();
		Thread.sleep(6000);
		click((By.xpath("//span[@ng-click='helper.showCQRSFZJLayer = !helper.showCQRSFZJLayer']")));
		// 产权获得方式
		click((By.xpath("//*[@ng-model='house.propertyRightGetWays']/div[1]/input")));
		click((By.xpath("//*[@ng-model='house.propertyRightGetWays']/div[2]/div[2]")));
		// 房屋年限
		click((By.xpath("//*[@ng-model='house.propertyAgeType']/div[1]/input")));
		click((By.xpath("//*[@ng-model='house.propertyAgeType']/div[2]/div[2]")));
		// 家庭唯一住房
		click((By.xpath("//*[@ng-model='house.onlyOneType']/div[1]/input")));
		click((By.xpath("//*[@ng-model='house.onlyOneType']/div[2]/div[2]")));
		// 原始买入发票金额
		sendKeys((By.xpath("//*[@ng-model='house.originalBuyInvoiceMoney']")), "500000");
		// 契税发票是否提供
		click((By.xpath("//input[@ng-model='house.contractTaxType'][@value='1']")));
		// 发票金额
		sendKeys((By.xpath("//input[@ng-model='house.contractTaxMoney']")), "100000");
		// 抵押状况
		click((By.xpath("//*[@ng-model='house.mortgageType']/div[1]/input")));
		click((By.xpath("//*[@ng-model='house.mortgageType']/div[2]/div[2]")));
		click((By.xpath("//*[@ng-model='house.mortgageTypeCount']/div[1]/input")));
		click((By.xpath("//*[@ng-model='house.mortgageTypeCount']/div[2]/div[2]")));
		// 抵押权人
		sendKeys((By.xpath("//input[@ng-model='o.mortgageName']")), "抵押权人");
		sendKeys((By.xpath("//input[@ng-model='o.mortgageMoney']")), "500000");
		click((By.xpath("//div[@date='o.mortgageStartDate']/input")));
		click((By.xpath("//div[@date='o.mortgageStartDate']/div/table/tbody/tr[4]/td[4]")));
		click((By.xpath("//div[@date='o.mortgageEndDate']/input")));
		click((By.xpath("//div[@date='o.mortgageEndDate']/div/table/tbody/tr[4]/td[4]")));
		// 租赁状况
		click((By.xpath("//input[@ng-model='house.rentType'][@value='53']")));
		sendKeys((By.xpath("//input[@ng-model='house.rentName']")), "承租�?");
		click((By.xpath("//div[@date='house.rentStartDate']/input")));
		click((By.xpath("//div[@date='house.rentStartDate']/div/table/tbody/tr[4]/td[4]")));
		click((By.xpath("//div[@date='house.rentEndDate']/input")));
		click((By.xpath("//div[@date='house.rentEndDate']/div/table/tbody/tr[4]/td[4]")));
		// 房东佣金确认�?
		click((By.xpath("//a[@ng-click='showFDYJQUSLayerFunc()']")));
		click((By.xpath("//div[@attach-list='house.fdyjqrsAttachmentList']/button")));
		uploadFile();
		Thread.sleep(6000);
		click((By.xpath("//span[@ng-click='helper.showFDYJQUSLayer = !helper.showFDYJQUSLayer']")));
		// 居间协议
		click((By.xpath("//a[@ng-click='showFDCJJGMXYLayerFunc()']")));
		click((By.xpath("//div[@attach-list='house.fdcjjgmxyAttachmentList']/button")));
		uploadFile();
		Thread.sleep(6000);
		click((By.xpath("//span[@ng-click='helper.showFDCJJGMXYLayer = !helper.showFDCJJGMXYLayer']")));
		// 卖房签约确认事项
		click((By.xpath("//a[@ng-click='showmfqyqrsxLayerFunc()']")));
		click((By.xpath("//div[@attach-list='house.mfqyqrsxAttachmentList']/button")));
		uploadFile();
		Thread.sleep(6000);
		click((By.xpath("//span[@ng-click='helper.showmfqyqrsxLayer = !helper.showmfqyqrsxLayer']")));
		// 其他附件
		click((By.xpath("//a[@ng-click='showFWOthersLayerFunc()']")));
		click((By.xpath("//div[@attach-list='house.fwOthersAttachmentList']/button")));
		uploadFile();
		Thread.sleep(6000);
		click((By.xpath("//span[@ng-click='helper.showFWOthersLayer = !helper.showFWOthersLayer']")));
		Thread.sleep(2000);
		// 返回顶部
		click((By.xpath("//a[@class='icon in_block mt_10 js_toTop']")));
		Thread.sleep(3000);
		// 产权证书
		click((By.xpath("//a[@ng-click='showCQZSLayerFunc()']")));
		click((By.xpath("//div[@attach-list='house.cqzsAttachmentList']/button")));
		uploadFile();
		Thread.sleep(6000);
		click((By.xpath("//span[@ng-click='helper.showCQZSLayer = !helper.showCQZSLayer']")));
		// 房屋性质
		click((By.xpath("//div[@ng-model='house.houseType']/div[1]/input")));
		click((By.xpath("//div[@ng-model='house.houseType']/div[2]/div[2]")));
		Thread.sleep(2000);

		// 客户信息
		click((By.xpath("//div[@class='customerTab right  hideCustomerTab']")));
		Thread.sleep(1000);
		// 购买人�?�质
		click((By.xpath("//div[@ng-model='customer.customerType']/div[1]/input")));
		click((By.xpath("//div[@ng-model='customer.customerType']/div[2]/div[2]")));
		// 客户名下住房
		click((By.xpath("//div[@ng-model='customer.existingHouses']/div[1]/input")));
		click((By.xpath("//div[@ng-model='customer.existingHouses']/div[2]/div[2]")));
		// 是否贷款
		click((By.xpath("//input[@ng-model='customer.loanMoney'][@value='1']")));
		// 征信报告
		click((By.xpath("//a[@ng-click='helper.showZXBGLayer = true']")));
		click((By.xpath("//div[@attach-list='customer.kfzzbgAttachmentList']/button")));
		uploadFile();
		Thread.sleep(5000);
		click((By.xpath("//span[@ng-click='helper.showZXBGLayer = !helper.showZXBGLayer']")));
		// 买受方数�?
		click((By.xpath("//div[@ng-model='customer.customerCount']/div[1]/input")));
		click((By.xpath("//div[@ng-model='customer.customerCount']/div[2]/div[2]")));
		// 主联系人
		sendKeys((By.xpath("//input[@ng-model='customer.customerName']")), "fg");
		sendKeys((By.xpath("//input[@ng-model='customer.customerPhone']")), "18516560506");
		// 买受�?
		sendKeys((By.xpath("//input[@ng-model='buyer.realName']")), "姓名");
		click((By.xpath("//input[@ng-model='buyer.adult'][@value='1']")));
		click((By.xpath("//div[@ng-model='buyer.huKouType']/div[1]/input")));
		click((By.xpath("//div[@ng-model='buyer.huKouType']/div[2]/div[2]")));
		click((By.xpath("//div[@ng-model='buyer.marriageType']/div[1]/input")));
		click((By.xpath("//div[@ng-model='buyer.marriageType']/div[2]/div[2]")));
		click((By.xpath("//input[@ng-model='buyer.gender'][@value='67']")));
		click((By.xpath("//a[@ng-click='showMSFSFZJLayerFunc(buyer)']")));
		click((By.xpath("//div[@attach-list='file.msfsfzjAttachmentList']/button")));
		uploadFile();
		Thread.sleep(5000);
		click((By.xpath("//span[@ng-click='helper.showMSFSFZJLayer = !helper.showMSFSFZJLayer']")));
		click((By.xpath("//a[@ng-click='showMSFSRZMLayerFunc(buyer)']")));
		click((By.xpath("//div[@attach-list='file.msfsrzmAttachmentList']/button")));
		uploadFile();
		Thread.sleep(5000);
		click((By.xpath("//span[@ng-click='helper.showMSFSRZMLayer = !helper.showMSFSRZMLayer']")));
		// 买方佣金确认�?
		click((By.xpath("//a[@ng-click='helper.showMFYJQUSLayer = true']")));
		click((By.xpath("//div[@attach-list='customer.mfyjqrsAttachmentList']/button")));
		uploadFile();
		Thread.sleep(5000);
		click((By.xpath("//span[@ng-click='helper.showMFYJQUSLayer = !helper.showMFYJQUSLayer']")));
		// 买方签约确认事项
		click((By.xpath("//a[@ng-click='helper.showMFQYQRSXLayer = true']")));
		click((By.xpath("//div[@attach-list='customer.mfqyqrsxAttachmentList']/button")));
		uploadFile();
		Thread.sleep(5000);
		click((By.xpath("//span[@ng-click='helper.showMFQYQRSXLayer = !helper.showMFQYQRSXLayer']")));
		// 其他附件
		click((By.xpath("//a[@ng-click='helper.showKFOthersLayer = true']")));
		click((By.xpath("//div[@attach-list='customer.mfOtherAttachmentList']/button")));
		uploadFile();
		Thread.sleep(5000);
	}

	public void save() {
		click((By.xpath("//span[@ng-click='helper.showKFOthersLayer = !helper.showKFOthersLayer']")));
	}

}
