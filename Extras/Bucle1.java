import java.util.Scanner;
/**
* Juan  Pedro Mancera Taboada
* Bucle que pide una frase y la repite x veces
*/
public class Bucle1 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println ("Introduce la frase para repetir ");
String frase = s.nextLine();

System.out.println ("Introduce el numero de veces a repetir la frase");
int vueltas = Integer.parseInt(s.nextLine());
  for (int i = 1; i <= vueltas;i++){
    System.out.println (frase);
    
  }
}
}
