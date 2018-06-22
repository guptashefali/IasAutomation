package com.ias.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ias.assertions.Compare;
import com.ias.base.DriverInstance;
import com.ias.pom.LoginPage;
import com.ias.pom.LoginPageFactory;
import com.ias.utility.Utility;

public class LoginTest extends DriverInstance {

	@Test
	public void testingLoginFunctionality() throws IOException {

		/*
		 * LoginPage login = new LoginPage(driver);
		 * login.enterUserName(Utility.fetchPropertyValue("username"));
		 * login.enterPassword(Utility.fetchPropertyValue("password"));
		 * login.clickSignIn();
		 */
		LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.login(Utility.fetchPropertyValue("username"),
				Utility.fetchPropertyValue("password"));
		Assert.assertTrue(
				Compare.validatePageURL(driver,
						Utility.fetchPropertyValue("successfulSignIn")),
				"ERROR : not matching expected with actual");
	}
}
