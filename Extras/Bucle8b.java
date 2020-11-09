import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Hacer escalera de numeros de 2 en 2
*/
public class Bucle8b {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

  System.out.print("Introduce el numero de lineas: ");
  int lineas = Integer.parseInt(s.nextLine());
  int total= 0;
  for ( int i = 1; i<= lineas; i++){
    
    for (int x = 1;x <= i; x++){
      total = x ;
      System.out.print(total+ " ");
    }
    System.out.println("");
  }

}
}
