package informes;

/**
 * Fábrica abstracta (Abstract Factory). Declara un método de creación por
 * cada tipo de informe; cada fábrica concreta representa una categoría y
 * devuelve la familia completa de informes de esa categoría.
 */
public interface FabricaInformes {

    InformeFactura crearFactura();

    InformeCompra crearCompra();
}
