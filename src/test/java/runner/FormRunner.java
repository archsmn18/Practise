package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(features= {"\\src\\test\\resources\\Forms\\Simple_Form.feature"},glue={"steps"})  // Run for the Simple_Form.feature

	@CucumberOptions(features= {"C:\\Users\\Archisman\\Documents\\workspace-spring\\BDD_Cucumber_TestNg\\src\\main\\resources\\Forms\\DataDrivenForm.feature"},glue={"steps"})

public class FormRunner extends AbstractTestNGCucumberTests{
}
