package com.dooioo.szshouhou.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;
/**
 * 贷款方案书填写页面
 * 
 * @author ancongxue
 *
 */


public class DKFA_FillPage extends Page {

	public void loanRequirement(String loanType) {
		if (loanType.equals("不贷款")) {
			driver.findElement(By.xpath("//div[@ng-model='params.loanNeedType']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.loanNeedType']//*//div[contains(text(),'不贷款')]"))
					.click();
		}
		if (loanType.equals("商业贷款")) {
			driver.findElement(By.xpath("//div[@ng-model='params.loanNeedType']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.loanNeedType']//*//div[contains(text(),'商业贷款')]"))
					.click();
			driver.findElement(By.xpath("//input[@ng-model='params.businessLoanNeed.loanMoney']")).sendKeys("500000");
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[2]/div[1]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[2]/div[2]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[2]/div[1]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[2]/div[2]/div[8]"))
					.click();
		}
		if (loanType.equals("公积金贷款")) {
			driver.findElement(By.xpath("//div[@ng-model='params.loanNeedType']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.loanNeedType']//*//div[contains(text(),'公积金贷款')]"))
					.click();
			driver.findElement(By.xpath("//input[@ng-model='params.businessLoanNeed.loanMoney']")).sendKeys("500000");
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[2]/div[1]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[2]/div[2]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[2]/div[1]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[2]/div[2]/div[8]"))
					.click();
		}
		if (loanType.equals("组合贷款")) {
			driver.findElement(By.xpath("//div[@ng-model='params.loanNeedType']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.loanNeedType']//*//div[contains(text(),'组合贷款')]"))
					.click();
			driver.findElement(By.xpath("//input[@ng-model='params.businessLoanNeed.loanMoney']")).sendKeys("500000");
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[2]/div[1]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanRate']/div[2]/div[2]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[2]/div[1]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.businessLoanNeed.loanScale']/div[2]/div[2]/div[8]"))
					.click();
			driver.findElement(By.xpath("//input[@ng-model='params.fundLoanNeed.loanMoney']")).sendKeys("500000");
			driver.findElement(By.xpath("//div[@ng-model='params.fundLoanNeed.loanRate']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.fundLoanNeed.loanRate']/div[2]/div[1]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.fundLoanNeed.loanRate']/div[2]/div[2]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.fundLoanNeed.loanScale']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.fundLoanNeed.loanScale']/div[2]/div[1]/div[8]"))
					.click();
			driver.findElement(By.xpath("//div[@ng-model='params.fundLoanNeed.loanScale']/div[2]/div[2]/div[8]"))
					.click();
		}
		else{
			System.out.println("请输入正确的贷款类型：不贷款、商业贷款、公积金贷款、组合贷款");
		}
	}

	public void customerInfo(String marriageStatus) {
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.loanerName']")).sendKeys("客户姓名");
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.gender'][@value='66']")).click();
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.age']")).sendKeys("28");
		driver.findElement(By.xpath("//div[@ng-model='params.mainCustomerInfo.huKouType']/div[1]/input")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.mainCustomerInfo.huKouType']/div[1]/input")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.mainCustomerInfo.huKouType']/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.mainCustomerInfo.marriageType']/div[1]/input")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.mainCustomerInfo.marriageType']/div[2]/div[3]")).click();
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.nonageChild'][@value='true']")).click();
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.workUnitName']")).sendKeys("工作单位");
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.workPosition']")).sendKeys("职务");
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.annualIncome']")).sendKeys("190000");
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.inCard'][@value='true']")).click();
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.houseWithParentsCount']"))
				.sendKeys("2");
		driver.findElement(By.xpath("//input[@ng-model='params.mainCustomerInfo.otherHouseCount']")).sendKeys("1");
		driver.findElement(By.xpath("//div[@ng-model='dropdownCheckboxData']/ul")).click();
		driver.findElement(By.xpath("//div[@ng-model='dropdownCheckboxData']/div/span[1]/input")).click();
		driver.findElement(By.xpath("//input[@ng-model='item.monthlyAmount']")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@ng-model='item.overdue'][@value='true']")).click();
		if (marriageStatus == "已婚") {
			driver.findElement(By.xpath("//input[@ng-model='params.loanCustomerInfo.loanerName']")).sendKeys("客户配偶");
			driver.findElement(By.xpath("//input[@ng-model='params.loanCustomerInfo.age']")).sendKeys("26");
			driver.findElement(By.xpath("//div[@ng-model='params.loanCustomerInfo.huKouType']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.loanCustomerInfo.huKouType']/div[1]/input")).click();
			driver.findElement(By.xpath("//div[@ng-model='params.loanCustomerInfo.huKouType']/div[2]/div[3]")).click();
			driver.findElement(By.xpath("//input[@ng-model='params.loanCustomerInfo.workUnitName']")).sendKeys("工作单位");
			driver.findElement(By.xpath("//input[@ng-model='params.loanCustomerInfo.workPosition']")).sendKeys("职务");
			driver.findElement(By.xpath("//input[@ng-model='params.loanCustomerInfo.annualIncome']"))
					.sendKeys("170000");
			driver.findElement(By.xpath("//input[@ng-model='params.loanCustomerInfo.inCard'][@value='true']")).click();
		}
	}

	public void loanBook(String loanType) throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.handleType']/div[1]/input")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.handleType']/div[2]/div[3]")).click();
		driver.findElement(By.xpath("//a[@ng-click='helper.showAttachDiv = true']")).click();
		driver.findElement(By.xpath("//div[@attach-list='params.assistAttachs']/button")).click();
		Runtime.getRuntime().exec("C:\\Users\\ancongxue\\Downloads\\uploadfile.exe");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//span[@ng-click='helper.showAttachDiv = !helper.showAttachDiv']")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.bankName']/div[1]/input")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.bankName']/div[2]/div[3]")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.bankRate']/div[1]/input")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.bankRate']/div[2]/div[1]/div[8]")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.bankRate']/div[2]/div[2]/div[8]")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.bankLoanScale']/div[1]/input")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.bankLoanScale']/div[2]/div[1]/div[8]")).click();
		driver.findElement(By.xpath("//div[@ng-model='params.loanBookInfo.bankLoanScale']/div[2]/div[2]/div[8]")).click();
		driver.findElement(By.xpath("//textarea[@ng-model='params.loanBookInfo.remark']")).sendKeys("我是选择理由");
	}
	public void submit(){
		driver.findElement(By.xpath("//span[@ng-click='submitLoanplanbook()']")).click();
	}


}
