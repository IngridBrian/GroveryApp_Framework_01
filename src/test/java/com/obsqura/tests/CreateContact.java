package com.obsqura.tests;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsqura.utilities.ReadExcelUtility;
import com.obsqura.utilities.TestProperties;

import models.Person;

public class CreateContact extends BaseTest {

	
	@Test
	public void CreateContactTest() throws IOException {
		
		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);
		hp.navigateToManageContact();
		List<Person> personList = ReadExcelUtility.ReadDataFromExcel();
		
		for(Person person :personList) {
			cp.EnterDataIntoForm(person);
			
			String alertText = cp.GetContaactUpdateAlertText();
			if(alertText.contains("Contact Updated Successfully")) {
				Assert.assertTrue(true);
			}
			else {
				Assert.fail();
			}
			
			
		}
		
	}
	

}
