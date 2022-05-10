package Lab_01;

public class Scope {
	 public static void main(String[] args) {
         
	        int n=5;//La variable "n" no puede ser llamada dentro del metodo factorialRecursivo directamente.
	       
	        int resultado=factorialRecursivo(n);
	         
	        System.out.println(resultado);
	         
	    }
	     
	    public static int factorialRecursivo(int numero){
	         
	        int res;//La variable "res" no puede ser llamada en el main directamente.
	         
	        if(numero==1){
	            
	            return 1;
	        }else{
	            
	            res = numero * factorialRecursivo(numero-1);
	        }
	         
	       
	        return res;
	         
	    }
}
