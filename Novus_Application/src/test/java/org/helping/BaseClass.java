package org.helping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void openChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

}
