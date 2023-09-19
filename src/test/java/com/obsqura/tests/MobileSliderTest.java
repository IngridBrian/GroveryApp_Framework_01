package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class MobileSliderTest extends BaseTest{
	
	@Test
	public void MYMobileSliderTest() throws IOException {
		
		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);		hp.NavigateToMobileSlider();
		am.ClickNewBtn();
		am.AddMobileSlider();
		String alertText=am.ValidateMobileSliderCreated();
		if (alertText.contains("Alert!\n" 
				+ "Mobile Slider Created Successfully"))
			
				{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

	}

}
