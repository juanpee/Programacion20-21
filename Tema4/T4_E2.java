public class T4_E2 {
  public static void main(String[] args) {
    String linea;
     int hora;
    
    System.out.println("¿Que hora es?");
    linea = System.console().readLine();
    
   
    hora= Integer.parseInt( linea );

    if (hora >=6 && hora <=12) {
      System.out.println("Buenos dias");
      
    } else {
        if (hora >=13 && hora <=20) {
        System.out.println("Buenas tardes");
        
        }else {
          if (hora >=21 && hora <=24) {
          System.out.println("Buenas noches");
          
          }else 
            {if (hora >=0 && hora <=5) {
              System.out.println("Buenos noches");
          } else {
            System.out.println("La hora introducida no es valida");
          }
    }
  }
}
}
}
