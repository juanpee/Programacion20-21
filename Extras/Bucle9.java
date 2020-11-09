import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Hacer escalera de numeros de 2 en 2
*/
public class Bucle9 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);

    System.out.print("Introduce el numero de lineas: ");
    int lineas = Integer.parseInt(s.nextLine());
    lineas = lineas * 2;
    String salida = "";
  
    for ( int i = 1; i< lineas; i++){
    salida = (salida + " " + i);
    System.out.println(salida);
    i++;
    salida = (salida + " " + i);
    
    }

  }
}
