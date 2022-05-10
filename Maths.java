/*
 * Calculo de PI a partir del lanzamiento de un dardo sobre un cuadrante
 * situado en un un cuadrado de lado 1u
*/

import java.util.Scanner;

public class Maths{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero de dardos: ");
        int dardos = sc.nextInt();
        System.out.println("Calculando PI...");

        int contador = 0;
        for (int i = 0; i < dardos; i++){
            if (modulo())
                contador++;
        }

        double valor_pi = 4 * contador / dardos;

        System.out.println("Dardos dentro del cuadrante: " + contador);
        System.out.println("Dardos fuera del cuadrante: " + (dardos - contador));
        System.out.println("Valor aproximado de PI: " + valor_pi);
    }

    public static boolean modulo(){
        double numX = Math.random();
        double numY = Math.random();

        return (Math.pow(numX, 2) + Math.pow(numY, 2)) <= 1;
    }
}
