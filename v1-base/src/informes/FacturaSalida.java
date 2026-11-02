package informes;

/** Producto concreto: factura de SALIDA (emitida a un cliente). */
public class FacturaSalida extends InformeBase implements InformeFactura {

    public FacturaSalida() {
        super("SALIDA", "FACTURA");
    }

    @Override
    protected String accion() {
        return "Factura emitida a cliente: se asigna el consecutivo y se registra la cuenta por cobrar.";
    }
}
