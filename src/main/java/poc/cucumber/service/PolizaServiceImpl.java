package poc.cucumber.service;

import poc.cucumber.model.Poliza;
import poc.cucumber.model.Producto;
import org.springframework.stereotype.Service;

@Service
public class PolizaServiceImpl implements PolizaService {

    public Poliza getPoliza(String id){
        return getMockPoliza(id);
    }

    private Poliza getMockPoliza(String id) {

        Poliza poliza = new Poliza();
        poliza.setId(id);
        poliza.setAplicacion("test-application");
        poliza.setDuracion("1000");
        poliza.setEstado("OK");
        poliza.setFirmaDigital("XXYY");
        poliza.setIdioma("Castellano");
        poliza.setNumeroDePoliza("123455");
        poliza.setProducto(getMockProducto());

        return poliza;
    }

    private Producto getMockProducto() {

        Producto producto = new Producto();
        producto.setLinea("linea test");
        producto.setCodigo("CDDFF");
        producto.setMarca("Direct");
        producto.setRamo("auto");

        return producto;
    }
}
