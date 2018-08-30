package com.example.echo.poccucumberrestassured;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import lombok.extern.java.Log;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@Log
public class PolizaStepDefs {

    private static final int STATUS_OK = 200;

    private Response response;

    @When("^El usuario invoca al servicio de polizas con id (.*?)$")
    public void user_calls_version(String id) throws Throwable {
        response = given().pathParam("id", 2).when().get("/polizas/{id}");
    }

    @Then("^El usuario obtine la poliza correctamente")
    public void user_receives_status_code() throws Exception {
        response.then().assertThat().statusCode(is(STATUS_OK));

    }

    @And("^El ramo de la poliza recibida es (.*?)$")
    public void user_receiver_version(String ramo) throws Throwable {
        response.then().assertThat().body("producto.ramo" , is(ramo));
    }
}
