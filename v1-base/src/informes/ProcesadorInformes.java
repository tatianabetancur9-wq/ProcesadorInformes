package informes;

/**
 * Cliente del patrón. Interpreta el nombre CAT_TIPO_nombre.txt, obtiene la
 * fábrica de la categoría y le pide el informe del tipo indicado. No conoce
 * ninguna clase concreta, por lo que no cambia cuando el sistema evoluciona.
 */
public class ProcesadorInformes {

    public void procesarInformes(String[] nombres) {
        int procesados = 0;
        int omitidos = 0;
        for (String nombre : nombres) {
            try {
                crearInforme(nombre).procesar(nombre);
                procesados++;
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                System.out.println("[OMITIDO] " + nombre + ": " + e.getMessage());
                omitidos++;
            }
        }
        System.out.println();
        System.out.println("Resumen: " + procesados + " informe(s) procesado(s), " + omitidos + " omitido(s).");
    }

    Informe crearInforme(String nombre) {
        String[] partes = nombre.split("_", 3);
        if (partes.length < 3 || !partes[2].endsWith(".txt")) {
            throw new IllegalArgumentException("el nombre no sigue el formato CAT_TIPO_nombre.txt");
        }
        FabricaInformes fabrica = Categoria.desdeCodigo(partes[0]).getFabrica();
        return TipoInforme.desdeCodigo(partes[1]).crear(fabrica);
    }
}
