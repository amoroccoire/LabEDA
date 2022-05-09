import java.util.Scanner;
public class JavaTypeCasting {
  public static void main(String[] args) {
    // Se crea un programa que almacena 5 notas de tipo double para luego imprimir el promedio
    // El resultado lo imprimen con una variable int

    //Declaración de variables
    int nota1, nota2, nota3, rsp; 
    double nota4, nota5;
    double aux;
    Scanner sc = new Scanner(System.in);

    System.out.print("Nota 1: ");
    nota1 = sc.nextInt();
    System.out.print("\nNota 2: ");
    nota2 = sc.nextInt();
    System.out.print("\nNota 3: ");
    nota3 = sc.nextInt();
    System.out.print("\nNota 4: ");
    nota4 = sc.nextDouble();
    System.out.print("\nNota 5: ");
    nota5 = sc.nextDouble();

    aux = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
    //Luego lo convertimos todo a un int

    rsp = (int) aux;

    System.out.println("\nPromedio :" + rsp);

  }
}
