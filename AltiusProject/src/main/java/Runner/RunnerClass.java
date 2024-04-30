package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="FeatureFiles/CustomerModule.feature",
glue={"StepDefinitions","generic"},dryRun=false,plugin="html:target/report.html")
public class RunnerClass  extends AbstractTestNGCucumberTests{
	

}
