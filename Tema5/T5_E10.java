import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Calcular media de numeros introducidos 
* e introducir un numero negativo para parar la introducion de datos
*/
public class T5_E10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double nota = 0;
    int cantidad = 0;
    double total = 0;
    do {
      System.out.println("Introduce una nota: ");
      nota = (s.nextInt());
      total = total + nota;
      cantidad ++;
    }while(nota >0);
    total = total - nota;
      cantidad --;
    double media = total / cantidad;
    System.out.println("Has introducido: " + cantidad + " notas.");
    System.out.println("La media de las notas es: " + media );
  }
}
