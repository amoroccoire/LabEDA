import java.util.Scanner;
public class JavaComments {
  public static void main(String[] args) {
    /* Los comentarios sirven para añadir explicación al código realizado
     Haciendolo más legible*/
    //Declaración de variables
    int num1, num2;
    Scanner sc = new Scanner(System.in);
    //Se muestra un mensaje:
    System.out.println("Escoja dos números:");
    //Se muestra un mensaje y esta recibe la información escrito por el usuario
    System.out.println("Número 1: ");
    num1 = sc.nextInt();
    //Se hace lo mismo con la variable num2
    System.out.println("Número 2: ");
    num2= sc.nextInt();
    //Impresión de datos 
    System.out.println("Número 1: " + num1 + " y Número 2: " + num2);  
  }
}

