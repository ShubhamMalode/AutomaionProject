package com.shubham_automaton_V1.testCases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.shubham_automaton_V1.pageObjects.HomePage;
import com.shubham_automaton_V1.pageObjects.PassWordPage;
import com.shubham_automaton_V1.pageObjects.ProductDetailsPage;
import com.shubham_automaton_V1.pageObjects.ProductsPage;
import com.shubham_automaton_V1.pageObjects.SignUpPage;
import com.shubham_automaton_V1.pageObjects.UserNamePage;

public class Assignment1 extends BaseClass {

	@Test
	public void amazonLoginAndAddingProductToCart() throws AWTException, InterruptedException {

		driver.get(baseURL);
		driver.manage().window().maximize();
		WrapperClass wrap = new WrapperClass(driver);
		SignUpPage sp = new SignUpPage(driver);
		UserNamePage up = new UserNamePage(driver);
		PassWordPage pp = new PassWordPage(driver);

		sp.clickOnSignIn();
		
		up.setUserName(username);
		up.clickContinue();
		wrap.waitTillPageLoad();
		pp.setPass(password);
		pp.SignIn();
		wrap.waitTillPageLoad();

		if (driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		wrap.waitTillPageLoad();
		HomePage homePage = new HomePage(driver);
		homePage.searchProduct("poco m3 pro");
		homePage.clickSearchbtn();
		wrap.waitTillPageLoad();
		
		ProductsPage productPage = new ProductsPage(driver);
		productPage.clickProductName();
		
		wrap.windowHandle(driver);
		wrap.waitTillPageLoad();
		ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		productDetails.clickAddToCart();
		productDetails.clickOnCartBtn();
		String price = productDetails.getProductPrice();
		Assert.assertEquals(price, "");
		wrap.windowHandle(driver);
		
		wrap.mouseHoverOnElement(productDetails.accountList);
		productDetails.clickOnSIgnOut();
	}

}
