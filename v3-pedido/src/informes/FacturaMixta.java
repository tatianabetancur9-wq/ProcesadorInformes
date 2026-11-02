package informes;

/** Producto concreto: factura MIXTA (incluye movimientos de entrada y de salida). */
public class FacturaMixta extends InformeBase implements InformeFactura {

    public FacturaMixta() {
        super("MIXTA", "FACTURA");
    }

    @Override
    protected String accion() {
        return "Factura mixta: se concilian los valores por pagar y por cobrar antes de registrarla.";
    }
}
