import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class array_string {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    String [] datos;
    datos  = new String [10];
    
    for(int i = 0;i < datos.length;i++){
    System.out.print("Introduce los datos que quieres guardar : ");
    datos[i] = s.nextLine();
    }
    for(int i = 0;i < datos.length;i++){
    System.out.print(" "+ datos[i]);
    }
  }
}
