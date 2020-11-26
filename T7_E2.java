import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T7_E2 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int [] datos;
    datos  = new int [10];
  
    datos [0] ='a';
    datos [1] ='x';
    datos [4] = '@';
    datos [6] = ' ';
    datos [7] = '+';
    datos [8] = 'Q';
    
    for(int i = 0;i < datos.length;i++){
    System.out.print(" "+ datos[i]);
    }
  }
}
