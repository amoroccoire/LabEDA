/*
 * Dada una oracion contar cuantos espacios, digitos y letras hay
*/
public class Strings{
    public static void main(String[] args){
        
        int numLetras = 0;
        int numEspacios = 0;
        int numDigitos = 0;

        String oracion = "El dia de Arequipa es el 15 de Agosto";

        for (char letra:oracion.toCharArray()){
            if(Character.isLetter(letra))
                numLetras++;
            else if (Character.isDigit(letra))
                numDigitos++;
            else
                numEspacios++;
        }

        System.out.println("Letras en la oracion: " + numLetras);
        System.out.println("Espacios en la oracion: " + numEspacios);
        System.out.println("Digitos en la oracion: " + numDigitos);
    }
}
