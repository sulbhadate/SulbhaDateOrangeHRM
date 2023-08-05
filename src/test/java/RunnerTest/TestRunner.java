package RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "AllfeatureFile" }, glue = { "StepDifination" }, dryRun = false

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
