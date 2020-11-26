import java.util.Scanner;

/**
 * Juan Pedro Mancera Taboada EJ:
 */
public class T7_E10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] datos;
        datos = new int[20];
        int b = 0;
        int[] datosb;
        datosb = new int[20];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                datosb[b] = datos[i];
                b++;
            }
        }
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 != 0) {
                datosb[b] = datos[i];
                b++;
            }
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print(" " + datos[i]);
        }
        System.out.println("");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(" " + datosb[i]);
        }
    }
}
