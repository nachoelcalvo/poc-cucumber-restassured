package com.example.echo.poccucumberrestassured;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import lombok.extern.java.Log;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@Log
public class VersionStepDefs {

    private Response response;

    @When("^the user calls /version$")
    public void user_calls_version() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        response = given().when().get("/version");
        log.info("calling /versions");
    }

    @Then("^the user receives and status code (\\d+)$")
    public void user_receives_status_code(int status) throws Exception {
        log.info("Checking status code ...");
        assertThat(status, is(response.getStatusCode()));
    }

    @And("^the user receives server version (.+)$")
    public void user_receiver_version(String version) throws Throwable {
        response.then().assertThat().body("version" , is(version));
    }
}
