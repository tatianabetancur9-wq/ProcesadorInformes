package informes;

/** Fábrica concreta de la categoría MIXTA (evolución 1). */
public class FabricaMixta implements FabricaInformes {

    @Override
    public InformeFactura crearFactura() {
        return new FacturaMixta();
    }

    @Override
    public InformeCompra crearCompra() {
        return new CompraMixta();
    }
}
