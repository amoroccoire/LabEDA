public class JavaVariables {
  public static void main(String[] args) {
    // Las variables son contenedores de la información asignadas;
    // Declaración de variables y asignación
    String name = "Gabriel";
    int age = 18;
    // Se puede declarar primero las variables
    String lastName, direction;
    int nota1, nota2;
    //Luego asignarles información
    lastName = "Machicao";
    direction = "3 de Octubre, cmt 4 lt 4";
    nota1 = 15;
    nota2 = 20;
    //Para luego usar dicha información
    //Salida de resultados
    System.out.println("Información del Estudiante");
    System.out.println("Nombre Completo: " + name + " " + lastName);
    System.out.println("Dirección: " + direction );
    System.out.println("Promedio de sus dos notas: " + ((15+20)/2));

  }
}

