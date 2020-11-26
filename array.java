import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class array {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int [] datos1;
    datos1  = new int [5];
    
    int [] datos2;
    datos2  = new int [8];
    
    int [] datos3;
    datos3  = new int [13];
    
    int b= 0;
    
    for(int i = 0;i < datos1.length;i++){
    System.out.print("Introduce los datos que quieres guardar en el primer array : ");
    datos1[i] = s.nextInt();
    }
    for(int i = 0;i < datos2.length;i++){
    System.out.print("Introduce los datos que quieres guardar en el segundo array: ");
    datos2[i] = s.nextInt();
    }
    
    for(int i = 0;i < datos1.length;i++){
    datos3[i] = datos1[i];
    }
    
    for(int i = 5;i < datos3.length;i++){
    datos3[i] = datos2[b];
    b++;
    }
    System.out.println("La combinación del primer array y del segundo en un tercero es la siguiente: ");
    for(int i = 0;i < datos3.length;i++){
    System.out.print(" "+ datos3[i]);
    }
    
  }
}
