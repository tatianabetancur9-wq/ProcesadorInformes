package informes;

/**
 * Fábrica abstracta (Abstract Factory). Declara un método de creación por
 * cada tipo de informe; cada fábrica concreta representa una categoría y
 * devuelve la familia completa de informes de esa categoría.
 */
public interface FabricaInformes {

    InformeFactura crearFactura();

    InformeCompra crearCompra();

    /**
     * Evolución 2: el tipo PEDIDO solo existe en la categoría ENTRADA. El
     * método por defecto evita modificar las fábricas que no lo soportan;
     * solo FabricaEntrada lo sobrescribe.
     */
    default InformePedido crearPedido() {
        throw new UnsupportedOperationException("la categoría no admite informes de tipo PEDIDO");
    }
}
