import java.util.Scanner;

/**
 * Juan Pedro Mancera Taboada EJ:
 */
public class T7_E9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] datos;
        datos = new int[8];

        for (int i = 0; i < datos.length; i++) {
            System.out.print("Introduce los datos que quieres guardar : ");
            datos[i] = s.nextInt();
        }
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                System.out.println("par   " + datos[i]);
            } else {
                System.out.println("impar   " + datos[i]);
            }

        }
    }
}