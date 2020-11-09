import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Introducir un numero por pantalla y si es par mostrar la tabla de multiplicar y si es impar la tabla de suma
*/
public class Bucle7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero = 0;
    System.out.println("Untroduce un numero ");
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
