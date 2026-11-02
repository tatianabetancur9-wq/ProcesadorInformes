package informes;

/** Producto concreto: compra de ENTRADA (mercancía que llega al almacén). */
public class CompraEntrada extends InformeBase implements InformeCompra {

    public CompraEntrada() {
        super("ENTRADA", "COMPRA");
    }

    @Override
    protected String accion() {
        return "Compra recibida: se confirma la recepción de la mercancía y se suma al inventario.";
    }
}
