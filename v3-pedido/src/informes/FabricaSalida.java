package informes;

/** Fábrica concreta de la categoría SALIDA. */
public class FabricaSalida implements FabricaInformes {

    @Override
    public InformeFactura crearFactura() {
        return new FacturaSalida();
    }

    @Override
    public InformeCompra crearCompra() {
        return new CompraSalida();
    }
}
