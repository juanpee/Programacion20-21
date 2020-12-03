import java.util.Scanner;

/**
 * Juan Pedro Mancera Taboada EJ: Escribe un programa que rellene un array de
 * 100 elementos con números enteros aleatorios comprendidos entre 0 y 500
 * (ambos incluidos). A continuación el programa mostrará el array y preguntará
 * si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá
 * a mostrar el array escribiendo el número destacado entre dobles asteriscos.
 */
public class T7_E13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] datos;
        datos = new int[100];

        int minimo = 500;
        int maximo = 0;

        int a = 0;

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 501);
            System.out.print(" " + datos[i]);
            if (datos[i] < minimo) {
                minimo = datos[i];
            }
            if (datos[i] > maximo) {
                maximo = datos[i];
            }
        }

        System.out.println("");

        System.out.println("¿Que numero quieres destacar? ");
        System.out.println("1.- El minimo ");
        System.out.println("2.- El maximo ");

        a = s.nextInt();
        switch (a) {
            case 1:
                for (int i = 0; i < datos.length; i++) {
                    if (datos[i] == minimo) {
                        System.out.print(" **" + datos[i] + "** ");
                    } else {
                        System.out.print(" " + datos[i]);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < datos.length; i++) {
                    if (datos[i] == maximo) {
                        System.out.print(" **" + datos[i] + "** ");
                    } else {
                        System.out.print(" " + datos[i]);
                    }
                }
                break;
        }
    }
}