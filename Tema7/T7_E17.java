import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T7_E17 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int [] datos;
    datos  = new int [10];
    boolean si=false;
    int posicion = 0;
    
    for(int i = 0;i < datos.length;i++){
     datos[i] = (int) (Math.random() * 101);
    }
    for(int i = 0;i < datos.length;i++){
    System.out.print(" "+ datos[i]);
    }
    do{
    System.out.println("Dime un numero de los monstrados anteriormente ");
    int num = (s.nextInt());
    for(int i = 0;(i < datos.length)&&(si==false);i++){
     if(datos[i]== num){
      si = true;
      posicion= i;
     }
     
    }
    }while(si==false);
    int fijo = datos[posicion];
    int prueba = datos.length;
    int aux = 0;
    
    do{
      aux =datos[datos.length-1];
      
      for(int i = prueba-1;i > 0;i--){
        datos[i] = datos[i-1];
        }
        
      datos[0] = aux;
      
    }while(datos[0]!=fijo);
    
    for(int b = 0;b < datos.length;b++){
    System.out.print(" "+ datos[b]);
    }
     System.out.println(" ");
    
    
  }
}
