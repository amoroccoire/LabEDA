import java.util.Scanner;
public class JavaTypeCasting {
  public static void main(String[] args) {
    // Clasificación de variables
    int num1; //Este es un entero
    double num2; //Este es un decimal
    boolean respuesta; //Un boolean solo puede salir true o false
    char seccion; //Esto almacena un caracter
    String nombre; //Almacena varios caracteres
    Scanner sc = new Scanner(System.in);//Es una variable no primitiva
    //Impresión de mensajes
    System.out.println("Bienvenido, para crear una cuenta debe responder las siguientes preguntas");
    System.out.println("¿Cuál es su nombre?");
    nombre = sc.nextLine();
    System.out.println("¿Cuál es su edad?");
    num1 = sc.nextInt();
    System.out.println("¿Cuál es su altura (metros)");
    num2 = sc.nextDouble();
    System.out.println("¿Esta casado?(true/false)?");
    respuesta = sc.nextBoolean();
    System.out.println("¿Su clasificación es ?(a - b - c)");
    seccion = sc.next().charAt(0);

    System.out.println("Cuenta creada, confirmación de datos:");
    System.out.println("Su nombre es:" + nombre + "\nEdad: " + num1 + "\nAltura: " + num2 + "\nCasado: " + respuesta);
    System.out.println("Clasificación: " + seccion); 
  }
}

