import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Pedir dos numero,comprobar q son diferentes, empezar por el menos y de 7 en 7 hasta el mayor
*/
public class T5_E18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int primero = 0;
    int segundo = 0;
    int numero = 0;
    int a = 0;
    int b = 0;
    do{
    System.out.print("Introduce el primer numero: ");
     a =s.nextInt();
    
    System.out.print("Introduce el segundo numero: ");
     b =s.nextInt();
    }while(a==b);
    
    if(a < b){
    primero = a;
    segundo = b;
    }else {
    primero = b;
    segundo = a;
    }
    numero = primero;
    do {
      System.out.println(numero);
      numero = numero + 7;
    }while(numero<segundo);
  }
}
