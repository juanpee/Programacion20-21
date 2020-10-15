public class T4_E1 {
  public static void main (String [] args) {
    //Ejercicio de Juan Pedro Mancera Taboada
    //Introducir un dia de la semana y decir la primera asignatura
    System.out.print("Introduce un dia de la semana");
    String dia;
    dia = System.console().readLine();
    switch (dia) {
      case "lunes":
      System.out.print("El LUNES a primera hora tienes PROGRAMACIÓN");
      break;
      case "martes":
      System.out.print("El MARTES a primera hora tienes SISTEMAS INFORMATICOS");
      break;
      case "miercoles":
      System.out.print("El MIERCOLES a primera hora tienes PROGRAMACIÓN");
      break;
      case "jueves":
      System.out.print("El JUEVES a primera hora tienes PROGRAMACIÓN");
      break;
      case "viernes":
      System.out.print("El VIERNES a primera hora tienes SISTEMAS INFORMATICOS");
      break;
      case "sabado":
      System.out.print("El SABADO no tienes ninguna clase");
      break;
      case "domingo":
      System.out.print("El DOMINGO no tienes ninguna clase");
      break;
    }

  }
}
