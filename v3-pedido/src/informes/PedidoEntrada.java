package informes;

/** Producto concreto: pedido de ENTRADA (solicitado por un cliente). */
public class PedidoEntrada extends InformeBase implements InformePedido {

    public PedidoEntrada() {
        super("ENTRADA", "PEDIDO");
    }

    @Override
    protected String accion() {
        return "Pedido recibido de cliente: se verifica la disponibilidad y se reserva el inventario.";
    }
}
