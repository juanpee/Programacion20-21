public class T4_E3 {
  public static void main (String [] args) {
    //Ejercicio de Juan Pedro Mancera Taboada
    //Introducir un dia de la semana y decir la primera asignatura
    String linea;
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int n = Integer.parseInt( linea );
    switch (n) {
      case 1:
      System.out.print("LUNES");
      break;
      case 2:
      System.out.print("MARTES");
      break;
      case 3:
      System.out.print("MIERCOLES");
      break;
      case 4:
      System.out.print("JUEVES");
      break;
      case 5:
      System.out.print("VIERNES");
      break;
      case 6:
      System.out.print("SABADO");
      break;
      case 7:
      System.out.print("DOMINGO");
      break;
    }

  }
}
