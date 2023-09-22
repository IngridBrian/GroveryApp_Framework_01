package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;

public class CreateandDeleteExpense extends BaseTest {

	@Test
	public void MyCreateDeleteExpense() throws IOException {
		lp.Login();
		hp.NavigateToManageExpense();
		String date = DateUtility.GetCurrentDate();
		ecp.CreateUniqueTitle(date);
		/**
		 * Validation
		 */
		String textAlert= ecp.ValidateUniqueNameIsCreated();
		if(textAlert.contains("Expense Category Created Successfully")) {
			Assert.assertTrue(true);
		}	else {
				Assert.assertTrue(false);
	
			}
		
		/**
		 * Validation
		 */
		String text= ecp.DeleteExpenseCategory(date);
		System.out.println(text);
			
		if(text.contains("Alert!\n"
				+ "Expense Category Deleted Successfully")) {
			Assert.assertTrue(true);
		}
		else {
		Assert.assertEquals(text, "Expense Category Deleted Successfully");
		}
	}

}