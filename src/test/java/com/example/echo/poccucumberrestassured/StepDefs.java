package com.example.echo.poccucumberrestassured;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.java.Log;

@Log
public class StepDefs {

    @When("^the user calls /version$")
    public void user_calls_version() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        log.info("calling /versions");
    }

    @Then("^the user receives and status code (\\d+)$")
    public void user_receives_status_code(int code) throws Exception {
        log.info("Checking status code");
    }

    @And("^the user receives server version (.+)$")
    public void user_receiver_version(String version) throws Throwable {
        log.info("Checking server version");
    }
}
