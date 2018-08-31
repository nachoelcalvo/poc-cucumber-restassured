package poc;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class BaseIntegration {

    private static final WireMockServer wireMockServer = new WireMockServer();

    @BeforeClass
    public static void setUp() throws Exception {
        wireMockServer.start();

        configureFor("localhost", 8080);
        stubFor(get(urlEqualTo("/polizas/2"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"id\": \"2\",\n" +
                                "  \"numeroDePoliza\": \"123455\",\n" +
                                "  \"aplicacion\": \"test-application\",\n" +
                                "  \"estado\": \"OK\",\n" +
                                "  \"idioma\": \"Castellano\",\n" +
                                "  \"duracion\": \"1000\",\n" +
                                "  \"firmaDigital\": \"XXYY\",\n" +
                                "  \"producto\": {\n" +
                                "    \"marca\": \"Direct\",\n" +
                                "    \"ramo\": \"auto\",\n" +
                                "    \"codigo\": \"CDDFF\",\n" +
                                "    \"linea\": \"linea test\"\n" +
                                "  }\n" +
                                "}")));
    }

    @AfterClass
    public static void tearDown() throws Exception {
        wireMockServer.stop();
    }
}
