import java.util.Scanner;
/**
* Juan  Pedro Mancera Taboada
* Bucle que pide un numero y calcula su potencia las veces indicadas
*/
public class Bucle4 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.println ("Introduce el numero a multiplicar");
      int multi = Integer.parseInt(s.nextLine());
System.out.println ("Introduce la veces que quieres multiplicar ese numero");
      int vueltas = Integer.parseInt(s.nextLine());
      int potencia = multi;
      
  for (int i = 1; i <= vueltas;i++){
    System.out.println ("la potencia de " + multi + " elevado a " + i + " es " + potencia);
   potencia = potencia*multi ;
    
  }
}
}
