package com.example.echo.poccucumberrestassured;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoController {

    @GetMapping(value = {"/version"})
    public String getVersion() {
        return "1.0";
    }
}