package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/resources/features",/*from root path  */
        glue = "org.example.StepDefs",/*refactor and then rename  */
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@simple"
)
/*to write in tags several tags "@test1 or @test 2 " */


/*the reason i used cucumber testng */
public class runners extends AbstractTestNGCucumberTests {
    /*this class used to run all test cases (traverse all feature files)  */
}
