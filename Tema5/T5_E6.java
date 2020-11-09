import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* Mostrar numero del 320 hasta 160 de 20 en 20 con bucle do while
*/
public class T5_E6 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int i = 320;
  
   do {
      System.out.println (i);
      i = i - 20;
    }while(i >= 160);

  }
}
