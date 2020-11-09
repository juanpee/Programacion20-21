import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* Mostrar numero del 320 hasta 160 de 20 en 20 con bucle while
*/
public class T5_E5 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int i = 320;
  
    while (i >= 160){
      System.out.println (i);
      i = i - 20;
    }

  }
}
