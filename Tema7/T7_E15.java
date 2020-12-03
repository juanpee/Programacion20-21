import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T7_E15{
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int [] mesas;
    mesas  = new int [11];
    int cliente = 0;
    int sitio = 0;
    boolean libre = false;
    boolean acompañado = false;
    int voy = 0;
    
    for(int i = 0;i < mesas.length;i++){
    mesas[i] = (int) (Math.random() * 5);
    }
    System.out.println("Listado de mesas");
    for(int i = 0;i < mesas.length;i++){
    System.out.print(" "+ mesas[i]);
    }
    System.out.println("");
    do{
      System.out.print("Hola buenas, ¿cuantos sois?");
      cliente = (s.nextInt());
      if(cliente>4){
        System.out.print("Lo siento no admitim grupos mas grandes de 4");
      }
    }while(cliente>4);
    
    for(int i = 0;(i < mesas.length)&&(libre==false);i++){
      if (mesas[i] == 0){
        libre = true;
        sitio = i;
      }
    }
    
    if(libre==true){
      System.out.print("Podeis sentarion en la mesa " + sitio);
    }
    
    if (libre==false){
      for(int i = 0;(i < mesas.length)&&(acompañado==false);i++){
        if ((mesas[i]+cliente) <5){
           acompañado = true;
           voy = i;
        }
       }
        if(acompañado == true){
         System.out.print("Podeis sentarion en la mesa " + voy);
        }
        if(acompañado == false){
         System.out.print("Lo sentimos no tenemos sitios libre");
        }
      
    }
  }
}
