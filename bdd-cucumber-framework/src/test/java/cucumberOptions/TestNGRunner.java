package cucumberOptions;

import org.checkerframework.checker.units.qual.t;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features="src/test/java/features/", // Feature file path.
    glue="stepDefinitions", // did not require to give full path.
    monochrome=true, // This used to help the console output in readable format. It will remove the unreadable characters from the console.
    dryRun=true, // This is will only check the mapping of feature file is correct with StepDifintion file or not. it will not execute the scenarios.
                // Dont add this when we;re executing the sceanrios. it will skip the execution of scenarios.
    tags="@SmokeTest or @RegressionTest", // Tags to run the specific scenarios. we can use and/or/not for the combination of tags.
    plugin={"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}// This is used to generate the report in different format. pretty is used to generate the report in readable format. html and json are used to generate the report in html and json format respectively.
    
)

public class TestNGRunner extends AbstractTestNGCucumberTests { //AbstractTestNGCucumberTests will help run the testRunner.
    


}
