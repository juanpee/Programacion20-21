import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:prueba examen ejercicio 1 gusano año 2019
*/
public class examen1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char letra = 'k';
    int posicion = 5;
    System.out.println("(j) para ir una posición a la izquierda");
    System.out.println("(k) para mantener la posición");
    System.out.println("(l) para ir una posición a la derecha");
    System.out.println("(s) para salir y finalizar el programa");
    System.out.println("Introduce la siguiente posición de gusano");
    do{
     switch (letra){
      case 'j':
       if (posicion <=0){
         posicion = 0;
       }else{
         posicion = posicion -1;
       }
       break;
       case 'k': 
       posicion = posicion;
       break;
       case 'l':
       if (posicion >=10){
         posicion = 10;
       }else{
         posicion = posicion +1;
       }
       break;
     }
     
     for (int i = 0;i <= posicion;i++) {
       System.out.print(" ");
      }
      System.out.print("*");
      
      for (int x=posicion; x<=20;x++){
      System.out.print(" ");
    }
    System.out.print("¿j,k,l,s?: ");
    letra = s.next().charAt(0);
      
    System.out.println("");
      
    }while(letra != 's');
      
    System.out.println("Adios");
    
  }
}
