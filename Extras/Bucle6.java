import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Pide 10 numeros por pantallas, almacenalos en un string y calcula su media
*/
public class Bucle6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero = 0;
    System.out.println("Introduce un numero ");
    numero = s.nextInt();
    
    if (numero%2 == 0) {
      System.out.println("Es par : ");
      for (int i = 1; i <= 10; i++){
        int multi = numero * i;
        System.out.println(numero + " * " + i + " = " + multi  );
       }
      
    }else {
      System.out.println("Es impar : ");
      for (int i = 1; i <= 10; i++){
        int suma = numero + i;
        System.out.println(numero + " + " + i + " = " + suma );
       }
    }

  }
}
