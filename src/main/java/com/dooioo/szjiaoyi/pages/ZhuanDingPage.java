package com.dooioo.szjiaoyi.pages;


import org.openqa.selenium.By;
import com.dooioo.fatherpage.Page;




public class ZhuanDingPage extends Page {

	
	public void fillForm() throws InterruptedException {
		//客户信息
		click(By.xpath("//input[@name='order.customer.dealType']"));
		sendKeys(By.name("order.customer.person.name"), "客户姓名");
		click(By.xpath("//input[@ng-model='order.customer.person.sex']"));
		selectByVisibleText(By.name("order.customer.person.certificateType"), "护照");
		sendKeys(By.xpath("//input[@ng-model='order.customer.person.certificateNo']"), "123456");
		click(By.xpath("//*[@id='editForm']/table[1]/tbody/tr[7]/td[3]/div/jiaoyi-upload/div/a"));
		uploadFile();
		Thread.sleep(5000);
		click(By.name("order.customer.person.loan"));

		//业主信息
		click(By.name("order.owner.dealType"));
		sendKeys(By.xpath("//input[@ng-model='order.owner.person.name']"), "业主姓名");
		click(By.name("order.owner.person.sex"));
		selectByVisibleText(By.xpath("//select[@ng-model='order.owner.person.certificateType']"), "护照");
		sendKeys(By.name("order.owner.person.certificateNo"), "123456");
		click(By.xpath("//*[@id='editForm']/table[2]/tbody/tr[7]/td[3]/div/jiaoyi-upload/div/a"));
		uploadFile();
		Thread.sleep(5000);

		//交易信息
		selectByVisibleText(By.xpath("//*[@id='editForm']/table[3]/tbody/tr[2]/td[3]/draw-doc/div/div[1]/div[1]/select"), "非制式文�?");
		click(By.xpath("//*[@id='editForm']/table[3]/tbody/tr[2]/td[3]/draw-doc/div/div[2]/div/div/a"));
		uploadFile();
		Thread.sleep(5000);
		click(By.name("supervised"));
		click(By.xpath("//*[@id='editForm']/table[3]/tbody/tr[4]/td[3]/div/jiaoyi-upload/div/a"));
		uploadFile();
		Thread.sleep(5000);
		sendKeys(By.name("order.orderPrice"), "500");
		sendKeys(By.name("order.customerConfirmMoney"), "10");
		sendKeys(By.name("order.ownerConfirmMoney"), "0");
		if (driver.findElement(By.name("order.discountReason")).isDisplayed()) {
			driver.findElement(By.name("order.discountReason")).sendKeys("我是十五个字的折佣原因，够十五个字了吗？");
		}
		click(By.xpath("//*[@id='editForm']/table[3]/tbody/tr[11]/td[3]/div/jiaoyi-upload/div/a"));
		uploadFile();
		Thread.sleep(5000);
		click(By.xpath("//input[@ng-model='order.hasBackMoney'][@value='false']"));
		click(By.xpath("//input[@name='order.hasOtherIncome'][@value='false']"));
		sendKeys(By.name("order.certificateNo"), "123456789");
		click(By.xpath("//*[@id='editForm']/table[3]/tbody/tr[19]/td[3]/div/jiaoyi-upload/div/a"));
		uploadFile();
		Thread.sleep(5000);
	}

	// 提交
	public void submit() throws InterruptedException {
		click(By.linkText("提交"));
		Thread.sleep(3000);
		click(By.xpath("//*[@id='layer_transferPreview']/div[3]/a[2]"));
	}

}
