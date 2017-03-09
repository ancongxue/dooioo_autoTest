package com.dooioo.shjiaoyi.pages;

import org.openqa.selenium.By;

import com.dooioo.fatherpage.Page;



public class FangyuanListPage extends Page {

	public FangyuanListPage(String url){
		super(url);
	}
	//返回房源编号
	public String getHouseNo(){
		//去掉“全部区域”“已委托”
		click(By.linkText("全部区域"));
		click(By.xpath("/html/body/div[3]/div/div[1]/div[3]/search-condition-filter/div[1]/span[2]/label[13]/input"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int i =2;
		click(By.xpath("/html/body/div[3]/div/search-result/table/tbody/tr["+i+"]/td[1]/span[2]/a"));
		SwitchTabByNum(2);
		//如果房源不存在，就继续获取下个房源
		while(driver.getTitle().contains("房源不存在")){
			SwitchTabByNum(1);
			i++;
			click(By.xpath("/html/body/div[3]/div/search-result/table/tbody/tr["+i+"]/td[1]/span[2]/a"));
			SwitchTabByNum(2);
		};
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'房源编号')]")).getText().substring(5));
		return driver.findElement(By.xpath("//div[contains(text(),'房源编号')]")).getText().substring(5);
		

		
	}
}
