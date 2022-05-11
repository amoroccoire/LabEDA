import java.util.Scanner;

public class FoorLoop {
	 public static void main(String[] args){
		 int n;
		Scanner scan=new Scanner(System.in);
		 System.out.println("Primeros n pares:");
		 System.out.print("Ingrese n:");
		 n=scan.nextInt();
		 System.out.println("Los primeros "+n+" Pares");
		 for (int i = 0; i <= n; i = i + 2) {
			 System.out.println(i);
		    } 
		 
	 }
}
