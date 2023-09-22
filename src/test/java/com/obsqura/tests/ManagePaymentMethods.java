package com.obsqura.tests;

import java.io.IOException;

import org.testng.annotations.Test;

public class ManagePaymentMethods extends BaseTest {

	@Test
	public void mangementPaymentTest() throws IOException {

		lp.Login();
		hp.NavigateToManagePayment();
		ep.editPayment();
	}

}
