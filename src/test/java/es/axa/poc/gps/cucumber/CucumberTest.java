package es.axa.poc.gps.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import es.axa.poc.gps.BaseIntegration;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class CucumberTest extends BaseIntegration {
}
