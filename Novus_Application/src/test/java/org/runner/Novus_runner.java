package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Shanmuga\\eclipse-workspace\\Novus_Application\\src\\test\\resources\\Feature Files", plugin = {
		"html:C:\\Users\\Shanmuga\\eclipse-workspace\\Novus_Application\\Reports\\HTML",
		"json:C:\\Users\\Shanmuga\\eclipse-workspace\\Novus_Application\\Reports\\Json\\Report2.json",
		"junit:C:\\Users\\Shanmuga\\eclipse-workspace\\Novus_Application\\Reports\\Junit\\Report2.xml" }, glue = "org.StepDefinition", dryRun = false)

public class Novus_runner {
}
