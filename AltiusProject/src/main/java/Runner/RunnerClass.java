package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="FeatureFiles/GoogleSearchPage.feature",
glue="StepDefinitions")
public class RunnerClass  extends AbstractTestNGCucumberTests{
	

}
