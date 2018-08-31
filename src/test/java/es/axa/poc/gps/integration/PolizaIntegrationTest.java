package es.axa.poc.gps.integration;

import es.axa.poc.gps.BaseIntegration;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;

public class PolizaIntegrationTest extends BaseIntegration {

    private static final int STATUS_OK = 200;

    @Test
    public void whenPolizaRequestGet_ThenOk() {
        when().
                get("/polizas/2").
        then()
                .statusCode(STATUS_OK);
    }

    @Test
    public void whenPolizaAutoGet_ThenRamoIsAuto() {
        given().
                pathParam("id", 2).
        when().
                get("/polizas/{id}").
        then().
                statusCode(STATUS_OK).
        and().
                body("producto.ramo", is("auto"));
    }

    @Test
    public void whenPolizaRequestGet_ThenResponseTimeIsAcceptable() {
        when().
                get("/polizas/2").
        then().
                time(lessThan(1000L), TimeUnit.MILLISECONDS);
    }


    @Test
    public void whenPolizaRequestGet_ThenPolizaDetailsAreLogged() {
        when().
                get("/polizas/2").
        then().
                log().ifStatusCodeIsEqualTo(STATUS_OK);
    }
}
