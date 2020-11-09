import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Hacer escalera de numeros de 2 en 2
*/
public class Bucle9b {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

  System.out.print("Introduce el numero de lineas: ");
  int lineas = s.nextInt();
  int numero = lineas * 2;
  int total= 0;
  System.out.println(1);
  
  for ( int i = 1; i< lineas; i++){
    
    for (int x = 2;x <= (i*2+2); x++){
    
    total = x-1;
    System.out.print(total);
    System.out.print(" ");
    }
  System.out.println("");
  }

}
}
