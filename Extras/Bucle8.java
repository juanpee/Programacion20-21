import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Hacer escalera de 1 en 1
*/
public class Bucle8 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

  System.out.print("Introduce el numero de lineas: ");
  int lineas = Integer.parseInt(s.nextLine());
  int numero;
  String salida = "";
  for (int i = 1; i<= lineas; i++){
    salida = (salida + " " + i);
    System.out.println(salida);
  }

}
}
