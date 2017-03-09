package com.dooioo.szshouhou.pages;



import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;
/**
 * 贷款方案书待处理列表页
 * @author ancongxue
 *
 */


public class DKFA_PendedPage extends Page {

	public void searchCase(String caseNum) {
		driver.findElement(By.xpath("//input[@ng-model='params.keyword']")).sendKeys(caseNum);
		driver.findElement(By.linkText("查询")).click();
		driver.findElement(By.xpath("//div[@class='jy-selector-wrapper popUp-box']/div[1]")).click();
		driver.findElement(By.linkText("写贷款方案书")).click();
	}

	public void fillDKFA() {
		click(By.xpath("//div[contains(text(),'操作']"));
		click(By.linkText("写贷款方案书"));
	}

	public void addFollow() {
		click(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr[2]/td[6]/div/div[1]"));
		click(By.linkText("写跟进"));
	}

	public void checkXXCJB() {
		click(By.xpath("//div[contains(text(),'操作']"));
		click(By.linkText("查看信息采集表"));
	}
}
