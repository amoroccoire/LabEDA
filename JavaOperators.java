import java.util.Scanner;
public class JavaOperators {
  public static void main(String[] args) {
    //El programa es una calculadora con las operaciones suma, resta, multiplicación y división
    //Declaración de variables
    int num1, num2, opcion;
    double resultado=0;
    Scanner sc = new Scanner(System.in);

    System.out.println ("Calculadora, registre los dos números");
    System.out.print ("Número 1: ");
    num1 = sc.nextInt();
    System.out.print("\nNúmero 2: ");
    num2 = sc.nextInt();
    System.out.println("Escoja la operación: ");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Múltiplicación");
    System.out.println("4. División");
    System.out.println("5. Modulo");

    opcion = sc.nextInt();

    //Operaciones
    if (opcion == 1)
      resultado = num1 + num2;
    else if (opcion == 2)
      resultado = num1 - num2;
    else if (opcion == 3)
      resultado = num1 * num2;
    else if (opcion == 4){
      if (num2 != 0)
	resultado = num1 / num2;
      else
	System.out.println (" Error, operación imposible");
    }
    else if (opcion == 5)
      resultado = num1 % num2;
    else
      System.out.println ("La operación no existe");

    if ((opcion < 0 || opcion > 5) || (opcion == 4 && num2 == 0))
      System.out.println ("Adios");
    else
      System.out.println ("Resultado: " + resultado);    
  }
}
