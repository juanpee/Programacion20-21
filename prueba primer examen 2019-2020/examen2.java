import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ: prueba examen piramide todos los sentidos año 2019
*/
public class examen2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int altura = 0;
    String orientacion = "arriba";
    
    do{
    System.out.print("Introduce la altura de la piramide(1 a 10): ");
    altura = s.nextInt();
    }while ((altura <1) || (altura > 10));
  
    do{
      System.out.println("Introduce el sentido de la piramide");
      System.out.println("(arriba,abajo,derecha,izquierda");
      orientacion = s.nextLine();
    }while(!(orientacion.equals("izquierda")|| orientacion.equals("derecha")||orientacion.equals("arriba")||orientacion.equals("abajo")));
   
    System.out.println("introduce el primer simbolo");
    char simbolo1 = s.next().charAt(0);
    System.out.println("introduce el segundo simbolo");
    char simbolo2 = s.next().charAt(0);
    
    switch (orientacion){
      case "izquierda":
      System.out.println("izquierda");
      break;
     
      case "arriba":
        for (int i = 1; i <= altura;i++){
    
          for (int z = 1; z <= (altura -i);z++){
   
            System.out.print(" ");
          }
        
          for (int b = 1; b <= ((i *2)-1);b++){
            if (b%2==0){
              System.out.print(simbolo2);
              }else {
              System.out.print(simbolo1);
              }
          }
        System.out.println("");
      }
      
      break;
      case "abajo":
        
        for (int i = 0; i<=altura;i++){
          for (int b = 1;b <= i;b++){
            System.out.print(" ");
          }
          for (int z = 1;z<=(((altura -i)*2)-1);z++){
             if (z%2==0){
              System.out.print(simbolo2);
              }else {
              System.out.print(simbolo1);
              }
          }
          
          System.out.println("");
        }
        
      break;
      case "derecha":
      System.out.println(7%2);
      break;
      
    } 
  }
}
