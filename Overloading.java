package Lab_01;

public class Overloading {
	public static void main(String [] args) {
		//existen dos metodos con el mismo nombre pero diferente cantidad de parametros,
		//lo cual es conocido como sobrecarga.
		sobrecarga("A");
		sobrecarga("B", "C");
	}
	
	public static void sobrecarga(String a) {
		System.out.println("Parametro "+a);
	}
	
	public static void sobrecarga(String b, String c) {
		System.out.println("Parametro1 "+b+" Parametro2 " +c);
	}
}
