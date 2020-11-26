import java.util.Scanner;

/**
 * Juan Pedro Mancera Taboada EJ:
 */
public class T7_E7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] datos;
        datos = new int[100];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 21);
            System.out.print(" " + datos[i]);
        }
        System.out.println("");

        System.out.print("El primer valor: ");
        int a = s.nextInt();

        System.out.print("El segundo valor: ");
        int b = s.nextInt();

        System.out.println("");

        String[] datosb;
        datosb = new String[100];

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == a) {
                datosb[i] = "'" + b + "'";
            } else {
                datosb[i] = "" + datos[i];
            }
        }
        for (int i = 0; i < datosb.length; i++) {
            System.out.print(" " + datosb[i]);
        }
    }
}