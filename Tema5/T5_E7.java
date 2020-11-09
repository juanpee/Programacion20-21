import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: Comprobar un codigo de 4 cifras 4 oportuniades
*/
public class T5_E7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int codigo = 1234;
    int prueba = 0;
    int intentos= 4;
    
    for (intentos= 4;intentos >=0;intentos--){
      System.out.print("Introduce el codigo secreto de 4 cifras: ");
     prueba = (s.nextInt());
     if(prueba == codigo){
       System.out.println("Has acertado el codigo");
       intentos = 0;
     }else{
       System.out.println("El codigo introducido no es el correcto, te quedan : " + intentos + " intentos");
     }
    }
  }
}
