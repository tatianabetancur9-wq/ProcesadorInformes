package informes;

import java.util.function.Function;

/**
 * Asocia el código de tipo del nombre de archivo (_TIPO_) con el método de
 * creación correspondiente de la fábrica abstracta.
 */
public enum TipoInforme {

    FAC(FabricaInformes::crearFactura),
    COM(FabricaInformes::crearCompra);

    private final Function<FabricaInformes, Informe> creador;

    TipoInforme(Function<FabricaInformes, Informe> creador) {
        this.creador = creador;
    }

    public Informe crear(FabricaInformes fabrica) {
        return creador.apply(fabrica);
    }

    public static TipoInforme desdeCodigo(String codigo) {
        for (TipoInforme tipo : values()) {
            if (tipo.name().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("tipo de informe desconocido '" + codigo + "'");
    }
}
