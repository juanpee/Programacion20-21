import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: piramide de numeros
*/
public class Bucle10 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);

    System.out.print("Introduce el numero de lineas: ");
    int lineas = Integer.parseInt(s.nextLine());
    
    for (int i = 1; i <= lineas;i++){
      
        for (int x=  1; x <= lineas-i;x++){
          System.out.print(" ");
        }
        for (int z= 1; z <= (lineas*2);z++){
          System.out.print(z);
        }
      
      System.out.println("");
      
    }
    
  }
}



