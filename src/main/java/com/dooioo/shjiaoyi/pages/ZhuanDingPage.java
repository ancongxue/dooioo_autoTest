package com.dooioo.shjiaoyi.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;



public class ZhuanDingPage extends Page{
	
	public void fillForm(){
		
		sendKeys(By.name("order.customer.person.name"),"客户姓名");
		click(By.name("order.customer.person.sex"));
		click(By.name("order.customer.person.loan"));
		selectByVisibleText(By.name("order.customer.person.certificateType"), "护照");
		sendKeys(By.name("order.customer.person.certificateNo"), "88888888");
		
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--证件扫描件'and @attach-type='11']/section/a"));
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--证件扫描件'and @attach-type='11']/section/div/div[2]/div[2]/jiaoyi-upload/div/a"));
		uploadFile();
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--证件扫描件'and @attach-type='11']/section/div/div[2]/div[1]/span[2]"));
		
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--限购告知书']/section/a"));
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--限购告知书']/section/div/div[2]/div[2]/jiaoyi-upload/div/a"));
		uploadFile();
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--限购告知书']/section/div/div[2]/div[1]/span[2]"));
		
		click(By.name("order.owner.dealType"));
		sendKeys(By.name("order.owner.person.name"),"业主姓名");
		click(By.name("order.owner.person.sex"));
		selectByVisibleText(By.name("order.owner.person.certificateType"), "护照");
		sendKeys(By.name("order.owner.person.certificateNo"),"999999999");
		
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--证件扫描件'and @attach-type='10']/section/a"));
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--证件扫描件'and @attach-type='10']/section/div/div[2]/div[2]/jiaoyi-upload/div/a"));
		uploadFile();
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--证件扫描件'and @attach-type='10']/section/div/div[2]/div[1]/span[2]"));
		
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--产调']/section/a"));
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--产调']/section/div/div[2]/div[2]/jiaoyi-upload/div/a"));
		uploadFile();
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--产调']/section/div/div[2]/div[1]/span[2]"));
		
		selectByVisibleText(By.name("order.certificateAreaNo"), "静");
		sendKeys(By.name("order.certificateYear"),"6");
		sendKeys(By.name("order.certificateNo"),"6");
		
		selectByVisibleText(By.xpath("//*[@id='editForm']/table[4]/tbody/tr[2]/td[1]/div[2]/doc-select/div/div/div[1]/select"), "非制式文书");
		click(By.xpath("//tips-doc-upload[@tip-name='双方居间协议扫描件']/div/div/div/section[1]/a"));
		click(By.xpath("//tips-doc-upload[@tip-name='双方居间协议扫描件']/div/div/div/section[1]/div/div[2]/div[2]/div/a"));
		uploadFile();
		click(By.xpath("//tips-doc-upload[@tip-name='双方居间协议扫描件']/div/div/div/section[1]/div/div[2]/div[1]/span[2]"));
		
		click(By.xpath("//input[@name='supervised' and @value='false']"));
		sendKeys(By.name("order.orderPrice"),"500");
		sendKeys(By.name("order.customerConfirmMoney"),"10");
		sendKeys(By.name("order.ownerConfirmMoney"),"10");
		
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--佣金确认书']/section/a"));
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--佣金确认书']/section/div/div[2]/div[2]/jiaoyi-upload/div/a"));
		uploadFile();
		click(By.xpath("//jiaoyi-tips-attach-upload[@tip-name='上传附件--佣金确认书']/section/div/div[2]/div[1]/span[2]"));
		
		click(By.xpath("//input[@name='order.hasBackMoney' and @value='false']"));
				
		
	}
	
	public void submit(){
		click(By.linkText("提交"));
	}

}
