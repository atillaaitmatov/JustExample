package RunnerCLasses;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/testReports/HtmlReport.html"},
        monochrome = true)
public class RunnerTheSteps {
    
}
