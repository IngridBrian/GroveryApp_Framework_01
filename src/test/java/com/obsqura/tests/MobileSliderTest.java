package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileSliderTest extends BaseTest {

	@Test
	public void MYMobileSliderTest() throws IOException {

		lp.Login();
		hp.NavigateToMobileSlider();
		am.ClickNewBtn();
		am.AddMobileSlider();
		String alertText = am.ValidateMobileSliderCreated();
		if (alertText.contains("Alert!\n" + "Mobile Slider Created Successfully"))

		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

	}

}
