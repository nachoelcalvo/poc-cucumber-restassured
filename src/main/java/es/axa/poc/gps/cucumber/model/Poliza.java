package es.axa.poc.gps.cucumber.model;

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
