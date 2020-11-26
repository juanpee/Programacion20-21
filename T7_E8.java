/**
 * Juan Pedro Mancera Taboada EJ:
 */
public class T7_E8 {
    public static void main(String[] args) {
        String linea;
        int[] datos;
        datos = new int[12];

        for (int i = 0; i < datos.length; i++) {
            System.out.print("Introduce la temperatura media del mes : " + (i + 1) + "  ");
            linea = System.console().readLine();
            datos[i] = Integer.parseInt(linea);
        }

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < 0) {
                for (int c = -1; c >= datos[i]; c--) {
                    System.out.print("<");
                }
            }
            if (datos[i] > 0) {
                for (int b = 1; b <= datos[i]; b++) {
                    System.out.print(">");
                }
            }

            if (datos[i] == 0) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
