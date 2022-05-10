/*
 * Verifica que un dia ingresado por teclado sea laborable o no
*/

import java.util.Scanner;

public class Switch{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dia de la semana: ");
        String day = sc.next();
        
        DiasSemana dia = DiasSemana.valueOf(day.toUpperCase());

        switch (dia){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia " + dia.name().toLowerCase() + " es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia " + dia + " no es laborable");
                break;
        }
    }
}

public enum DiasSemana{
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;
}
