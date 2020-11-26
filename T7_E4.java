import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T7_E4 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int [] numeros;
    numeros  = new int [20];
    
    long [] cuadrado;
    cuadrado  = new long [20];
    
    int [] cubo;
    cubo  = new int [20];
    
    for(int i = 0;i < numeros.length;i++){
    numeros[i] = (int)(Math.random()*101);
    }
    
    for(int i = 0;i < cuadrado.length;i++){
    cuadrado[i] = (numeros[i] * numeros[i]);
    }
    
    for(int i = 0;i < cubo.length;i++){
    cubo[i] = (numeros[i] * numeros[i] * numeros[i]);
    }
    
    for(int i = 0;i < numeros.length;i++){
      System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n","Numero : ", numeros[i] , " Cuadrado : " , cuadrado[i] , " Cubo : " , cubo[i]);
    }
    
  }
}
