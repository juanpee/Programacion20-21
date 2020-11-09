import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class pruebas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce tu edad: ");
    int edad = (s.nextInt());
    
    System.out.print(edad%10);

  }
}
