import java.util.Scanner;

public class breeak {
	 public static void main(String[] args){
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Ingrese un numero entre 0-6");
		 int mes = scan.nextInt();
    
	switch (mes) {
	   case 1:
	       System.out.println("El mes es LUNES");
	       break;
	   case 2:
	       System.out.println("El mes es MARTES");
	       break;
	   case 3:
	       System.out.println("El mes es MIERCOLES");
	       break;
	   case 4:
	       System.out.println("El mes es JUEVES");
	       break;
	   case 5:
	       System.out.println("El mes es VIERNES");
	       break;
	   case 6:
	       System.out.println("El mes es SABADO");
	       break;
	   case 0:
	       System.out.println("El mes es DOMINGO");
	       break;
	   default:
	       System.out.println("NO SE ENCONTRO EL DIA DE LA SEMANA");
	       break;
	}
	 }
}
