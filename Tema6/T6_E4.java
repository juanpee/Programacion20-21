import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T6_E4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numero = 0;
    String total = "";
    
    for (int i = 1; i <= 20; i++){
      numero = (int)(Math.random()*11);
      total += numero + " ";
    }
    
    System.out.println("los numeros son " +total);
  }
}
