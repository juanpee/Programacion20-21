import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class escaner {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce tu nombre: ");
    String nombre = s.nextLine();
    
    System.out.print("Introduce tu edad: ");
    int edad = (s.nextInt());
    
    System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad + " años");
  }
}
