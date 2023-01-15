package com.shubham_automaton_V1.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	public String baseURL = "https://www.amazon.in";
	public String username = "vrushabhmalode143@gmail.com";
	public String password = "Vrushabh@143";
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
