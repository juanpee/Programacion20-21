import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Pide 10 numeros por pantallas, almacenalos en un string y calcula su media
*/
public class T5_E13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero = 0;
    int positivos = 0;
    int negativos = 0;
      for (int i = 1; i <= 10; i++){
         System.out.println("Introduce un numero ");
          numero = s.nextInt();
          if (numero <0){
            positivos++;
          }else {
            negativos++;
       }
      
    }
    System.out.println("La cantidad de numeros positivos introducidos es : " + positivos);
    System.out.println("La cantidad de numeros negativos introducidos es : " + negativos);
  }
}
