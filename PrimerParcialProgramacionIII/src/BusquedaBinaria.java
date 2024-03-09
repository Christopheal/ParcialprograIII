public class BusquedaBinaria {
    public static int busquedaBinaria(int[] arr, int elemento) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == elemento) {
                return medio;
            } else if (arr[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] listaOrdenada = {10, 20, 30, 40, 50};
        int elementoBuscado = 40;

        int resultado = busquedaBinaria(listaOrdenada, elementoBuscado);

        if (resultado != -1) {
            System.out.println("El elemento " + elementoBuscado + "esta en la posicion" + resultado + "de la lista");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no esta en la lista ");
        }
    }
}

