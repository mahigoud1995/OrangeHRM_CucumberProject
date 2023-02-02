package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/java/AppFeatures"},
			glue= {"stepDefinition","applicationHooks"},
			plugin= {"pretty"}
		)


public class OrangeHRMTestRunner {

}
