package com.example.echo.poccucumberrestassured.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Poliza {

    private String id;
    private String numeroDePoliza;
    private String aplicacion;
    private String estado;
    private String idioma;
    private String duracion;
    private String firmaDigital;
    private Producto producto;
}
