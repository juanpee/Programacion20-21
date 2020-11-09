import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Pide 10 numeros por pantallas, almacenalos en un string y calcula su media
*/
public class Bucle5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dato = 0;
    String frase = "";
    int total = 0;
  for (int i = 1; i<=10; i++){
   
    System.out.println("Introduce un numero : ");
    dato = s.nextInt();
  
    total = total + dato;
    frase = frase + "|" + dato;
  
    }
  System.out.println("Los numeros introducidos son : " + frase);
  System.out.println("La suma de los nuemros es : " + total);
  double media = (double )total /10 ;
  System.out.println("La media es : " + media);

  }
}
