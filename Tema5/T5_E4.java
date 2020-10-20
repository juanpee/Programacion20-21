import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* Mostrar numero del 320 hasta 160 de 20 en 20
*/
public class T5_E4 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  for (int i = 320; i >= 160;i = i - 20){
    System.out.println (i);
  }

  }
}
