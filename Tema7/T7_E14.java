import java.util.Scanner;

/**
 * Juan Pedro Mancera Taboada EJ:Escribe un programa que pida 8 palabras y las
 * almacene en un array. A continuación, las palabras correspondientes a colores
 * se deben almacenar al comienzo y las que no son colores a continuación.
 * Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce
 * el programa deben estar en otro array y son los siguientes: verde, rojo,
 * azul, amarillo, naranja, rosa, negro, blanco y morado
 */
public class T7_E14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] datos;
        datos = new String[8];

        String[] colores;
        colores = new String[9];

        colores[0] = "verde";
        colores[1] = "rojo";
        colores[2] = "azul";
        colores[3] = "amarillo";
        colores[4] = "naranja";
        colores[5] = "rosa";
        colores[6] = "negro";
        colores[7] = "blanco";
        colores[8] = "morado";

        int color = 0;
        int palabra = 0;
        int c = 0;
        String[] copia;
        copia = new String[8];

        String[] palabras;
        palabras = new String[8];

        boolean prueba = false;

        for (int i = 0; i < datos.length; i++) {
            System.out.print("Introduce los datos que quieres guardar : ");
            datos[i] = s.nextLine();
            for (int b = 0; b < colores.length; b++) {
                if (datos[i].equals(colores[b])) {
                    prueba = true;
                }

            }
            if (prueba == true) {
                copia[color] = datos[i];
                color++;
            } else {
                palabras[palabra] = datos[i];
                palabra++;
            }
            prueba = false;
        }
        for (int i = color; i < copia.length; i++) {
            copia[i] = palabras[c];
            c++;
        }
        for (int i = 0; i < copia.length; i++) {
            System.out.print(" " + copia[i]);
        }
        System.out.println("");
        System.out.println("La cantidad de los colores es : " + color);
        System.out.println("La cantidad de los palabras es : " + palabra);
    }
}