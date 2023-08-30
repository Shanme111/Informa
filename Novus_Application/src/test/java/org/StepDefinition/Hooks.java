package org.StepDefinition;

import org.helping.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class Hooks extends BaseClass {

	@Before
	public static void before() {
		System.out.println("before");
		openChromeBrowser();
		driver.get("https://novusstg.informagm.com/");
	}

	@After
	public static void after() {
		System.out.println("after");
		driver.close();

	}

}