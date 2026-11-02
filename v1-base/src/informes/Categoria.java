package informes;

/**
 * Asocia el prefijo de categoría del nombre de archivo (CAT_) con su fábrica
 * concreta. Es el único punto del sistema que conoce las fábricas concretas.
 */
public enum Categoria {

    ENT(new FabricaEntrada()),
    SAL(new FabricaSalida());

    private final FabricaInformes fabrica;

    Categoria(FabricaInformes fabrica) {
        this.fabrica = fabrica;
    }

    public FabricaInformes getFabrica() {
        return fabrica;
    }

    public static Categoria desdeCodigo(String codigo) {
        for (Categoria categoria : values()) {
            if (categoria.name().equals(codigo)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("categoría desconocida '" + codigo + "'");
    }
}
