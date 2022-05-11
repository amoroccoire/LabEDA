import java.util.*;
public class ejercicioWhile {
	 public static void main(String[] args){
		 int suma,b,n;
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Suma de los primeros n numeros:");
		 System.out.print("Ingrese n:");
		 n=scan.nextInt();
		 suma=0;
		 int i=0;
		 while (i <=n) {
			 suma=i+suma;
		      i++;
		    }   
		 System.out.print("La suma de los "+n+" primeros numeros es:"+suma);
	 }
	 
}
