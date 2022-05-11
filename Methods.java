import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Introduce año: ");
        año = sc.nextInt();
        if(esBisiesto(año)){  //llamada al método
           System.out.println("Bisiesto");
        }else{
           System.out.println("No es bisiesto");
        }
    }    
    public static boolean esBisiesto(int a){    
        if(a%4==0 && a%100!=0 || a%400==0)
           return true;
        else
           return false;
    }

}
