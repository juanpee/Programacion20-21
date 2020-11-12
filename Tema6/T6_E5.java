import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T6_E5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numero = 0;
    int minimo = 199;
    int maximo = 0;
    int sumatotal = 0;
    int media = 0;
    String total = "";
    
    for (int i = 1; i <= 50; i++){
      numero = (int)(Math.random()*100+100);
      total += numero + " ";
      if (numero <= minimo){
        minimo = numero;
      }
      if (numero > maximo){
        maximo = numero;
      }
      sumatotal = sumatotal + numero;
    }
    media = sumatotal /50;
    
    System.out.println("los numeros son " +total);
    System.out.println("");
    System.out.println("El numero minimo es : " +minimo); 
    System.out.println("El numero maximo es : "+maximo);
    System.out.println("La suma total es : " + sumatotal);
    System.out.println("La media de los numeros es : " +media);
    
  }
}
