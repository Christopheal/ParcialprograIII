import java.util.Arrays;

public class    SuperGangas {
    public static boolean SuperGangas(int[] pedidos, int pedido) {
        int izquierda = 0;
        int derecha = pedidos.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (pedidos[medio] == pedido) {
                return true;´
            }
            if (pedidos[medio] < pedido) {
                izquierda = medio + 1;
            }
            else {
                derecha = medio - 1;
            }
        }
        return false;ñ
    }
    //No se como asignarle el nombre a cada id pero la idea era que el pedido se buscaba con el id a modo de codigo de barras y que este luego mostrara el id del pedido con el producto
    public static void main(String[] args) {
        int[] pedidos = {1,2,3,4,5,6,7,8,9,10};
        int pedidoenbusca = 5;
        Arrays.sort(pedidos);
    }
}
