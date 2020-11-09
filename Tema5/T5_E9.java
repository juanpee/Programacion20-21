import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:Introducir un numero y decir la cantidad de cifras que tiene
*/
public class T5_E9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero y te digo el numero de cifras: ");
    long numero = (s.nextLong());
    int resto = 0;
    int cifras = 0;
    do{
      if (numero <=9){
        cifras++;
        numero = 0;
      }
      if (numero >=10){
     numero = numero/10;
      cifras++;
      }
    }while(numero != 0);
    System.out.print("el numero tiene : " + cifras + " cifras");
  }
}
