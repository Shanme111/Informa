package org.StepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import org.helping.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Definition extends BaseClass {
	public static JavascriptExecutor JS;

	@Given("User Has To Launch IGM Application")
	public void user_Has_To_Launch_IGM_Application() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}

	@When("User Has To Click Client Login button")
	public void user_Has_To_Click_Client_Login_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()= 'Client Login']")).click();
		Thread.sleep(2000);
	}

	@When("User Has To Enter Valid {string} and {string}")
	public void user_Has_To_Enter_Valid_and(String UserName, String PassWord) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PassWord);
	}

	@When("User Has To Click The Signin button")
	public void user_Has_To_Click_The_Signin_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(28000);
	}

	@Then("User Has To Verify Credential Page")
	public void user_Has_To_Verify_Credential_Page() throws InterruptedException {
		String url = driver.getCurrentUrl();
		Thread.sleep(25000);
		if (url.contains("my-igm")) {
			System.out.println("valid credential ");
		} else {
			System.out.println("invalid credential");
		}
	}

	@Given("User Have To Login The Novus Application")
	public void user_Have_To_Login_The_Novus_Application(io.cucumber.datatable.DataTable d)
			throws InterruptedException {
		driver.findElement(By.xpath("//a[text()= 'Client Login']")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));

		Map<String, String> map = d.asMap(String.class, String.class);
		String username = map.get("UserName");
		String password = map.get("Password");

		user.sendKeys(username);
		pwd.sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(28000);
	}

	@When("User Have To Navigate to The Author Tab")
	public void user_Have_To_Navigate_to_The_Author_Tab() throws InterruptedException {
		WebElement author = driver.findElement(By.xpath("(//a[@class='ember-view'])[10]"));
		JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].scrollIntoView();", author);
		Thread.sleep(2000);
		author.click();
		Thread.sleep(2000);

	}

	@When("User Have To Create a New Story and Publish")
	public void user_Have_To_Create_a_New_Story_and_Publish() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Create Story']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='select-multiple'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='EUROPE']")).click();
		driver.findElement(By.xpath("//div[text()='ASIA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abin.abraham@informa.com");
		driver.findElement(By.xpath("//div[@class='redactor-editor']")).sendKeys("abin.abraham@informa.com");
		Thread.sleep(2000);
		JS.executeScript("window.scrollBy(0, 9000);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selectize-input items not-full']")).click();
		driver.findElement(By.xpath("//div[text()='LONG EN']")).click();
		driver.findElement(By.xpath("//div[text()='DEFAULT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='redactor-editor']")).click();
		Thread.sleep(2000);
		WebElement publish = driver.findElement(By.xpath("//button[text()='Publish Now']"));
		publish.click();
		Thread.sleep(5000);

	}

	@Then("To Take The ScreenShot")
	public void to_Take_The_ScreenShot() throws IOException, InterruptedException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Shanmuga\\eclipse-workspace\\IGM_Application\\ScreenShots\\Screen2.png");
		FileHandler.copy(src, des);
		Thread.sleep(5000);
	}
}
