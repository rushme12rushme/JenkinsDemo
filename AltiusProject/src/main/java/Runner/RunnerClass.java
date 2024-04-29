package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="FeatureFiles/ActiTimeLogin.feature",
glue="StepDefinitions",dryRun=false,plugin="html:target/report.html")
public class RunnerClass  extends AbstractTestNGCucumberTests{
	

}
