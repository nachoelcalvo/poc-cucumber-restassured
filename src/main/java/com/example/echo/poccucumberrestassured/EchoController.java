package com.example.echo.poccucumberrestassured;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoController {

    @GetMapping(value = {"/version"})
    public Version getVersion() {
        return new Version("1.0");
    }
}