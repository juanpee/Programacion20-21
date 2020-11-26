import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T7_E3 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int [] datos;
    datos  = new int [10];
    
    for(int i = 0;i < datos.length;i++){
    System.out.print("Introduce los datos que quieres guardar : ");
    datos[i] = s.nextInt();
    }
    
    for(int i = (datos.length - 1);i>=0;i--){
    System.out.print(" "+ datos[i]);
    
    }
  }
}
