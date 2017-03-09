package com.dooioo.szjiaoyi.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;



public class CaseListPage extends Page{
	public void searchCase(String caseNum) throws InterruptedException{

		 sendKeys(By.xpath("//*[@id='searchWord']"), caseNum);
		 click(By.xpath("//*[@id='caselist']/div/div[2]/a"));
		 Thread.sleep(2000);
	}
}
