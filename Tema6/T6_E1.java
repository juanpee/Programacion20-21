import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T6_E1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dado= 0;
    int total = 0;
    for (int i = 1; i <= 3; i++){
      dado = (int)(Math.random()*4+1);
      System.out.println("ha salido el : " + dado);
      total += dado;
    }
    
    System.out.println("La suma total de la tirada de dados es : " +total);
  }
}
