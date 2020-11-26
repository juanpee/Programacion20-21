import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T7_E1 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int [] datos;
    datos  = new int [12];
  
    datos [0] = 39;
    datos [1] = -2;
    datos [4] = 0;
    datos [6] = 14;
    datos [8] = 5;
    datos [9] = 120;
    
    for(int i = 0;i < datos.length;i++){
    System.out.print(" "+ datos[i]);
    }
  }
}
