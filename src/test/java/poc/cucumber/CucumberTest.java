package poc.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import poc.BaseIntegration;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class CucumberTest extends BaseIntegration {
}
