package informes;

/** Producto concreto: factura de ENTRADA (recibida de un proveedor). */
public class FacturaEntrada extends InformeBase implements InformeFactura {

    public FacturaEntrada() {
        super("ENTRADA", "FACTURA");
    }

    @Override
    protected String accion() {
        return "Factura recibida de proveedor: se valida el emisor y se registra la cuenta por pagar.";
    }
}
