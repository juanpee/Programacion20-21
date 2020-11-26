import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T7_E5 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int [] datos;
    int maximo = 0;
    
    datos  = new int [15];
    
    for(int i = 0;i < datos.length;i++){
    System.out.print("Introduce los datos que quieres guardar : ");
    datos[i] = s.nextInt();
    }
    int minimo = datos[0];
    for(int i = 0;i < datos.length;i++){
    if (datos[i]> maximo){
      maximo = datos[i];
    }
    if (datos[i] < minimo){
      minimo = datos[i];
    }
  }
    for(int i = 0;i < datos.length;i++){
      if(datos[i] == minimo){
        System.out.print(" El minimo es("+ datos[i]+")");
      }
      if(datos[i] == maximo){
        System.out.print(" El maximo es("+ datos[i]+")");
      }
      if(datos[i] != minimo && datos [i] != maximo){
      System.out.print(" "+ datos[i]);}
    }
    
    
    
  }
}
