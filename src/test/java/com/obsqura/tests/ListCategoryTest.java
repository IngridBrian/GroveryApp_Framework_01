package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.TestProperties;

public class ListCategoryTest extends BaseTest{

	@Test
	public void ManageCategoryTest() throws IOException {
		
		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);
		hp.NavigateToManageCategory();
		String date = DateUtility.GetCurrentDate();
		lc.createCategory(date);
		String alertText=lc.ValidateCategoryCreated();
		if (alertText.contains("Alert!\n" 
				+ "Sub Category Created Successfully"))		
				{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

	}
}
