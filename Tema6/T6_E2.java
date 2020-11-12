import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T6_E2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int npalo= 0;
    String palo = "";
    int ncarta = 0;
    String carta = "";
      npalo = (int)(Math.random()*4);
      switch (npalo){
        case (0):
        palo = "Corazones";
        break;
        case (1):
        palo = "Diamantes";
        break;
        case (2):
        palo = "Picas";
        break;
        case (3):
        palo = "Treboles";
        break;
      }
      ncarta = (int)(Math.random()*14+1);
      if ((ncarta == 1) || (ncarta>=11 && ncarta<=15)){
         switch (ncarta){
        case (1):
        carta = "A";
        break;
        case (12):
        carta = "J";
        break;
        case (13):
        carta = "Q";
        break;
        case (14):
        carta = "K";
        break;
      }
      }else {
        carta = carta + ncarta;
      }
    System.out.println("La carta elegida es : "+carta +" de " + palo);
  }
}
