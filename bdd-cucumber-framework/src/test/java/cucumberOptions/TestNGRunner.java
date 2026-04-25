package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features="src/test/java/features/firstProgram.feature", // Feature file path.
    glue="stepDefinitions", // did not require to give full path.
    monochrome=true,
    tags="@SmokeTest or @RegressionTest"
) // To get the output in plain english language.

public class TestNGRunner extends AbstractTestNGCucumberTests { //AbstractTestNGCucumberTests will help run the testRunner.
    


}
