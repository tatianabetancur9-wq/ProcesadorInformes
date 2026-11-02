package informes;

/**
 * Implementación base compartida por los productos concretos: imprime la
 * cabecera común y delega en cada subclase la acción propia de su
 * combinación categoría + tipo.
 */
public abstract class InformeBase implements Informe {

    private final String categoria;
    private final String tipo;

    protected InformeBase(String categoria, String tipo) {
        this.categoria = categoria;
        this.tipo = tipo;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public final void procesar(String archivo) {
        System.out.println("Procesando informe de " + categoria + " de tipo " + tipo + " [" + archivo + "]");
        System.out.println("    -> " + accion());
    }

    /** Simulación del procesamiento específico del informe. */
    protected abstract String accion();
}
