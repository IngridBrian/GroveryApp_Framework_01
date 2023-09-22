package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PushNotifications extends BaseTest {

	@Test
	public void PushNotificationsTest() throws IOException {

		lp.Login();
		hp.NavigateToPushNotifications();
		pn.createPushNotification();
		String textAlert = pn.validatePushNotification();
		if (textAlert.contains("Alert!\n" + "Message send successfully")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
	}

}
