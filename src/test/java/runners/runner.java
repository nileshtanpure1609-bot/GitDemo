package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class runner {
	
	@CucumberOptions(
			
			features = {"src/test/resources/appfeature/Login.feature"},
			
			glue = {"stepDefinitions"},
			
			plugin = {"pretty"},
			
			dryRun = true

			)

	public class LoginRunner extends AbstractTestNGCucumberTests{

	}}

			
		
