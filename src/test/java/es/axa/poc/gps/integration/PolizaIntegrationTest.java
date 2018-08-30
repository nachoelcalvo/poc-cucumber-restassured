package es.axa.poc.gps.integration;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;

public class PolizaIntegrationTest {

    public static final int STATUS_OK = 200;

    // Test created for POC purposes. An instance of POC-Poliza service must be running
    // before the execution of following test suite
    @Before
    public void setUp() throws Exception {
        baseURI = "http://localhost";
        port = 8080;
    }

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
