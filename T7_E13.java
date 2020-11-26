import java.util.Scanner;

/**
 * Juan Pedro Mancera Taboada EJ:
 */
public class T7_E13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] datos;
        datos = new int[100];

        int minimo;
        int maximo;

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 501);
            System.out.print(" " + datos[i]);
        }

        System.out.println("");

        System.out.println("¿Que numero quieres destacar? ");
        System.out.println("1.- El minimo ");
        System.out.println("2.- El maximo ");

        int a = s.nextInt();
        switch (a){
            1:
                for (int i = 0; i < datos.length; i++) {
                     if (datos[i] == minimo){
                     System.out.print(" **" + datos[i] + "** ");
                 }else{
                System.out.print(" " + datos[i]);
                 }  
        }
        2:
                for (int i = 0; i < datos.length; i++) {
                     if (datos[i] == maximo){
                     System.out.print(" **" + datos[i] + "** ");
                 }else{
                System.out.print(" " + datos[i]);
                 }  
        }
        }
}