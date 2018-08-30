package com.example.echo.poccucumberrestassured.controller;

import com.example.echo.poccucumberrestassured.modelo.Poliza;
import com.example.echo.poccucumberrestassured.service.PolizaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoController {

    private PolizaService polizaService;

    public EchoController(PolizaService polizaService) {
        this.polizaService = polizaService;
    }

    @GetMapping(value = {"/polizas/{id}"})
    public Poliza getPoliza(@PathVariable String id) {
        return polizaService.getPoliza(id);
    }
}