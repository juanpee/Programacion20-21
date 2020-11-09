import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Muestra en 3 columnas el numero introducido, su cuadrado y su cubo con 5 datos introducidos
*/
public class T5_E11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dato = 0;
    
    System.out.println("Introduce un numero : ");
    dato = s.nextInt();
    
    for (int i = 1; i<=5; i++){
   
      int cuadrado = dato * dato;
      int cubo = cuadrado * dato;
      
      System.out.printf("%-10s %-10s %-10s \n" , dato , cuadrado , cubo);
      
      dato = dato + i;
  
    }

  }
}
