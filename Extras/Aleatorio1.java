import java.util.Scanner;
/**
* Juan Pedro Mancera Taboada
* EJ:
*/
public class Aleatorio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dado= 0;
    int total = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int c4 = 0;
    int c5 = 0;
    int c6 = 0;
    for (int i = 1; i <= 1000; i++){
      dado = (int)(Math.random()*6+1);
      a = dado;
      do{
        dado = (int)(Math.random()*6+1);
        b = dado;
      }while(a==b);
       do{
        dado = (int)(Math.random()*6+1);
        c = dado;
      }while((b==c)||(a==c));
      switch(a){
        case 1:
        c1++;
        break;
        case 2:
        c2++;
        break;case 3:
        c3++;
        break;
        case 4:
        c4++;
        break;case 5:
        c5++;
        break;case 6:
        c6++;
        break;
      }
      switch(b){
        case 1:
        c1++;
        break;
        case 2:
        c2++;
        break;case 3:
        c3++;
        break;
        case 4:
        c4++;
        break;case 5:
        c5++;
        break;case 6:
        c6++;
        break;
      }
      switch(c){
        case 1:
        c1++;
        break;
        case 2:
        c2++;
        break;case 3:
        c3++;
        break;
        case 4:
        c4++;
        break;case 5:
        c5++;
        break;case 6:
        c6++;
        break;
      }
    }
   
    
    System.out.println("La suma total de la tirada de dados es : " +total);
    System.out.println("1 : " +c1);
    System.out.println("2 : " +c2);
    System.out.println("3: " +c3);
    System.out.println("4 : " +c4);
    System.out.println("5 : " +c5);
    System.out.println("6 : " +c6);
  }
}
