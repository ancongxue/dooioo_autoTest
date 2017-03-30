package com.dooioo.shjiaoyi;

import org.junit.Test;
import org.openqa.selenium.By;
import com.dooioo.config.Config;
import com.dooioo.shjiaoyi.pages.AddCasePage;
import com.dooioo.shjiaoyi.pages.CustomerDetailPage;
import com.dooioo.shjiaoyi.pages.FangyuanListPage;
import com.dooioo.shjiaoyi.pages.KeyuanListPage;


/**
 * 创建二手正常案源
 * @author ancongxue
 *
 */
public class TestCreateCase extends TestJiaoyi {
	
	    @Test
		public void createCase(){

	    	System.out.println("呵呵呵");
			FangyuanListPage fy = new FangyuanListPage(Config.getFangUrl());
			fy.open();
			String houseNo=fy.getHouseNo();
			
			KeyuanListPage ky = new KeyuanListPage(Config.getKyUrl());
			ky.open();
			String customerNo= ky.addCustomer();
			
			CustomerDetailPage cd= new CustomerDetailPage();
			cd.addCase(houseNo, Config.getCertificateAddress());

			
//			AddCasePage ac= new AddCasePage(Config.getKyUrl());
//			ac.open();
//			ac.addCase(houseNo, customerNo, Config.getCertificateAddress());

			
				
		}

}
