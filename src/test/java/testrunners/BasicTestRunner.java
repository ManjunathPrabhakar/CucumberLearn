package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/bddfeatures",
        glue = {"stepdefs"}, //G:\IntelliJWorkspace\CucumberFramework\src\main\java\project\stepdefs
        tags = {"@websearch or @daygames"}
)
public class BasicTestRunner extends AbstractTestNGCucumberTests {


}
