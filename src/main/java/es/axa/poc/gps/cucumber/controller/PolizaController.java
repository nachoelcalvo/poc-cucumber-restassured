package es.axa.poc.gps.cucumber.controller;

import es.axa.poc.gps.cucumber.model.Poliza;
import es.axa.poc.gps.cucumber.service.PolizaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PolizaController {

    private PolizaService polizaService;

    public PolizaController(PolizaService polizaService) {
        this.polizaService = polizaService;
    }

    @GetMapping(value = {"/polizas/{id}"})
    public Poliza getPoliza(@PathVariable String id) {
        return polizaService.getPoliza(id);
    }
}