import java.util.Scanner;

/**
 * Juan Pedro Mancera Taboada EJ: rotar un array una posicion a la derecha
 */
public class T7_E12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] datos;
        datos = new int[10];
        int fina;
        int inicio;

        int b = 0;
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Introduce los datos que quieres guardar : ");
            datos[i] = s.nextInt();
        }
        System.out.print("Introduce los datos que quieres guardar : ");
        inicio = s.nextInt();

        System.out.print("Introduce los datos que quieres guardar : ");
        fina = s.nextInt();

        int posicioninicio = datos[inicio];
        int posicionfinal = datos[fina];

        b = datos[(datos.length - 1)];
        for (int i = (datos.length - 1); i > 0; i--) {
            datos[i] = datos[(i - 1)];
        }
        datos[0] = b;

        datos[fina] = posicioninicio;
        datos[inicio] = posicionfina;
        for (int i = 0; i < datos.length; i++) {
            System.out.print(" " + datos[i]);
        }
    }
}