package com.dooioo.szshouhou.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;
/**
 * 贷款方案书审批页面
 * 
 * @author ancongxue
 *
 */


public class DKFA_ApprovalPage extends Page {

	public void edit() {
		click(By.xpath("//div[@id='edit']/a[contains(text(),'编辑')]"));
	}

	public void submitDirectorApproval() throws InterruptedException {
		click(By.linkText("审核通过"));
		Thread.sleep(2000);
		click(By.xpath("//button[@ng-click='submitDirectorApproval()']"));
	}

	public void submitManagerApproval() throws InterruptedException {
		click(By.linkText("审核通过"));
		Thread.sleep(2000);
		click(By.xpath("//button[@ng-click='submitManagerApproval()']"));
	}

}
