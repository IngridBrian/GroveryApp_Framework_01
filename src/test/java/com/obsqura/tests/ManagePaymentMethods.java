package com.obsqura.tests;

import org.testng.annotations.Test;

public class ManagePaymentMethods extends BaseTest {

	@Test
	public void mangementPaymentTest() {
		lp.Login();
		hp.NavigateToManagePayment();
		ep.editPayment();
	}
	
}
