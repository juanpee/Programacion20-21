import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Piramide con altura y simbolo introducido por teclado
*/
public class prueba {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce la altura de la piramide: ");
  int altura = Integer.parseInt(s.nextLine());
  
  System.out.print("Introduce el simbolo a pintar: ");
  String x = s.nextLine();
  int extra = altura -1;
  for (int i = 1; i <= altura;i++){
    
    for (int z = 1; z <= (altura -i);z++){
   
    System.out.print(" ");
    }
    
    for (int b = 1; b <= ((i *2)-1);b++){
    System.out.print(x);
    }
    
    
    System.out.println("");
  }
  
  }
}
