import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class T6_E3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int npalo= 0;
    String palo = "";
    int ncarta = 0;
    String carta = "";
      npalo = (int)(Math.random()*4);
      switch (npalo){
        case (0):
        palo = "Oro";
        break;
        case (1):
        palo = "Bastos";
        break;
        case (2):
        palo = "Espadas";
        break;
        case (3):
        palo = "Copas";
        break;
      }
      ncarta = (int)(Math.random()*10+1);
      if ((ncarta == 1) || (ncarta>=8 && ncarta<=10)){
         switch (ncarta){
        case (1):
        carta = "As";
        break;
        case (8):
        carta = "Zota";
        break;
        case (9):
        carta = "Caballo";
        break;
        case (10):
        carta = "Rey";
        break;
      }
      }else {
        carta = carta + ncarta;
      }
    System.out.println("La carta elegida es : "+carta +" de " + palo);
  }
}
