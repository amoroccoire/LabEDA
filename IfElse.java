/*
 * Encuentre la forma de probar if...else
*/

import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer Numero: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo Numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println("La resta de ambos es: " + (num1 - num2));
        else if (num1 < num2)
            System.out.println("La suma de ambos es: " + (num1 + num2));
        else if (num1 == num2)
            System.out.println("La multiplicacion de ambos es: " + (num1 * num2));
        else if (num2 % 2 == 0 )
            System.out.println("El segundo numero es par");
    }
}
