package com.dooioo.szshouhou;


import com.dooioo.szshouhou.pages.DKFA_FillPage;
import com.dooioo.szshouhou.pages.DKFA_PendedPage;

public class DKFATest {

	public static void main(String[] args) throws Exception {
		String caseNum ="15090117200419-20160821-001";

		

		// pendedpage
		DKFA_PendedPage pendedpage = new DKFA_PendedPage();
		pendedpage.searchCase(caseNum);
		pendedpage.fillDKFA();
		//fillpage

		DKFA_FillPage fillpage = new DKFA_FillPage();
		fillpage.SwitchTabByNum(2);
		fillpage.loanRequirement("商业贷款");
		fillpage.customerInfo("已婚");
		fillpage.loanBook("链家代办");
		//fillpage.submit();
		
	}
}
