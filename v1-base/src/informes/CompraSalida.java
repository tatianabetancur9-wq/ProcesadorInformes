package informes;

/** Producto concreto: compra de SALIDA (orden de compra enviada a un proveedor). */
public class CompraSalida extends InformeBase implements InformeCompra {

    public CompraSalida() {
        super("SALIDA", "COMPRA");
    }

    @Override
    protected String accion() {
        return "Orden de compra enviada al proveedor: se compromete el presupuesto y se notifica el pedido.";
    }
}
