import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: introducir un numero positivo y sumar los 100 numero siguientes
*/
public class T5_E17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero = 0;
    int total = 0;
    do{
      System.out.print("Introduce un numero: ");
     numero = (s.nextInt());
    }while(numero<0);
    
    for(int i =1;i<=100;i++){
      System.out.println(numero);
      numero = numero + i;
      total = total + numero;
    }
  }
}
