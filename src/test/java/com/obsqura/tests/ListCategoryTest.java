package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;

public class ListCategoryTest extends BaseTest{

	@Test
	public void ManageCategoryTest() {
		
		lp.Login();
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
