package informes;

/** Fábrica concreta de la categoría ENTRADA. */
public class FabricaEntrada implements FabricaInformes {

    @Override
    public InformeFactura crearFactura() {
        return new FacturaEntrada();
    }

    @Override
    public InformeCompra crearCompra() {
        return new CompraEntrada();
    }
}
