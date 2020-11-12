import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T6_E6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numero = 0;
    int introducido = 0;
    int intentos = 1;
    numero = (int)(Math.random()*101);
    System.out.println(numero);
    do{
      System.out.print("Introduce el numero secreto (entre 0 y 100): ");
      introducido = s.nextInt();
      
      if(introducido != numero){
        System.out.println("¡Ese no es el numero correcto!");
        System.out.println("llevas : "+intentos + " intentos");
        if (introducido <= numero){
          System.out.println("¡El numero es mayor!");
        }else{
           System.out.println("¡El numero es menor!");
        }
        intentos ++;
      }
        if(introducido==numero){
          System.out.println("Enhorabuena has acertado, el numero secreto era : "+numero);
        }
    }while((intentos>=5)||(numero!=introducido));
 /**   
    for (int i = 1; i <= 5;i++){
      System.out.print("Introduce el numero secreto (entre 0 y 100): ");
      introducido = s.nextInt();
      
      if(introducido != numero){
        System.out.println("¡Ese no es el numero correcto!");
        System.out.println("llevas : "+i + " intentos");
        if (introducido <= numero){
          System.out.println("¡El numero es mayor!");
        }else{
           System.out.println("¡El numero es menor!");
        }
        }
        if(introducido == numero){
          i =5;
          System.out.println("Enhorabuena has acertado, el numero secreto era : "+numero);
        }
        }
          if(introducido!=numero){
          System.out.println("¡Mal no has acertado!");
          System.out.println("El numero era el : "+numero);
      }*/
  }
}
