package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/Login/Login.feature"},
        glue = {"StepsDefinition"})
        //plugin = {"pretty", "html:target/HtmlReports"})
        //plugin = {"pretty", "json:target/json.report"})
        //plugin = {"pretty", "junit:target/xml.report")
public class PostRunnerTest {


}
