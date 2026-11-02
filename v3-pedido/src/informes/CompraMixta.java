package informes;

/** Producto concreto: compra MIXTA (recepción y despacho en un mismo documento). */
public class CompraMixta extends InformeBase implements InformeCompra {

    public CompraMixta() {
        super("MIXTA", "COMPRA");
    }

    @Override
    protected String accion() {
        return "Compra mixta: se separan las líneas de recepción y de despacho y se ajusta el inventario.";
    }
}
