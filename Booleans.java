public class Booleans{
    public static void main(String[] args){

        String frase = "Si puedes imaginarlo puedes programarlo";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++ ){
            if (frase.charAt(i) == 'a' ||
                    frase.charAt(i) == 'e' ||
                    frase.charAt(i) == 'i' ||
                    frase.charAt(i) == 'o' ||
                    frase.charAt(i) == 'u')
                contador++;
        }

        System.out.println("En la frase: " + frase + "hay: " + contador 
                + " vocales");
    }
}
