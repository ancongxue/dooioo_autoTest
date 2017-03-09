package com.dooioo.szshouhou.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;

/**
 * 售后跟进页面
 * @author ancongxue
 *
 */

public class ShouHou_FollowUpPage extends Page {

	public void followUp() throws InterruptedException {
		// 三方合同敲章
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='contract.operateAt']/input"));
		click(By.xpath("//div[@date='contract.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@date='contract.previewSignTime']/input"));
		click(By.xpath("//div[@date='contract.previewSignTime']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@ng-model='contract.loanType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='contract.loanType']/div[2]/div[2]"));
		click(By.xpath("//div[@ng-model='contract.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='contract.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitContract()']"));
		Thread.sleep(1000);

		// 网签时间
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='sign.operateAt']/input"));
		click(By.xpath("//div[@date='sign.operateAt']/div/table/tbody/tr[4]/td[4]"));
		sendKeys(By.xpath("//input[@ng-model='sign.signPrice']"), "5000000");
		click(By.xpath("//div[@ng-model='sign.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='sign.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitSign()']"));
		Thread.sleep(1000);

		// 资金托管
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='done.operateAt']/input"));
		click(By.xpath("//div[@date='done.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitDone()']"));
		Thread.sleep(1000);

		// 贷款办理
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='handleLoan.operateAt']/input"));
		click(By.xpath("//div[@date='handleLoan.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@date='handleLoan.loanDeadLine']/input"));
		click(By.xpath("//div[@date='handleLoan.loanDeadLine']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@ng-model='handleLoan.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='handleLoan.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitHandleLoan()']"));
		Thread.sleep(1000);

		// 贷款发放
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='done.operateAt']/input"));
		click(By.xpath("//div[@date='done.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitDone()']"));
		Thread.sleep(1000);

		// 办理过户
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='done.operateAt']/input"));
		click(By.xpath("//div[@date='done.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitDone()']"));
		Thread.sleep(1000);

		// 抵押登记
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='done.operateAt']/input"));
		click(By.xpath("//div[@date='done.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitDone()']"));
		Thread.sleep(1000);

		// 申报纳税
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='applyTax.operateAt']/input"));
		click(By.xpath("//div[@date='applyTax.operateAt']/div/table/tbody/tr[4]/td[4]"));
		sendKeys(By.xpath("//input[@ng-model='applyTax.buildingArea']"), "300");
		sendKeys(By.xpath("//input[@ng-model='applyTax.taxPrice']"), "300");
		click(By.xpath("//div[@ng-model='applyTax.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='applyTax.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitApplyTax()']"));
		Thread.sleep(1000);

		// 缴税时间
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='done.operateAt']/input"));
		click(By.xpath("//div[@date='done.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitDone()']"));
		Thread.sleep(1000);

		// 领证时间
		driver.findElement(By.linkText("点击填写")).click();
		click(By.xpath("//div[@date='done.operateAt']/input"));
		click(By.xpath("//div[@date='done.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[1]/input"));
		click(By.xpath("//div[@ng-model='done.scheduleType']/div[2]/div[1]"));
		click(By.xpath("//button[@ng-click='submitDone()']"));
		Thread.sleep(1000);

		// 领款时间
		driver.findElement(By.linkText("结案")).click();
		click(By.xpath("//div[@date='done.operateAt']/input"));
		click(By.xpath("//div[@date='done.operateAt']/div/table/tbody/tr[4]/td[4]"));
		click(By.xpath("//button[@ng-click='submitDone()']"));
		Thread.sleep(1000);

	}

	public void confirmCase() {
		// 确认结案
		driver.findElement(By.linkText("点击填写")).click();
		sendKeys(By.xpath("//textarea[@ng-model='overCaseParam.comment']"), "我是审批意见");
		driver.findElement(By.linkText("提交")).click();
	}

}
