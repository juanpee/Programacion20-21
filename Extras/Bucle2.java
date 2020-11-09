import java.util.Scanner;
/**
* Juan  Pedro Mancera Taboada
* Bucle que pide 10 veces dos numero y los suma
*/
public class Bucle2 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

  for (int i = 1; i <= 10;i++){
   System.out.println ("Introduce el primer numero");
      int n1 = Integer.parseInt(s.nextLine());
    System.out.println ("Introduce el segundo numero");
      int n2 = Integer.parseInt(s.nextLine());
  System.out.println ("El resultado de la suma es " + (n1 + n2));
  }
}
}
