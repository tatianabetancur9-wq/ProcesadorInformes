package informes;

/**
 * Interfaz común a todos los informes. El cliente (ProcesadorInformes)
 * solo trabaja con este tipo y nunca con las clases concretas.
 */
public interface Informe {

    String getCategoria();

    String getTipo();

    void procesar(String archivo);
}
