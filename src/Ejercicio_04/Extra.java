package Ejercicio_04;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        String palabra = "oso";
        String p1 = "amor";
        String p2 = "roma";


        if(esPolindroma(palabra)){
            System.out.println("Es polindroma");
        } else {
            System.out.println("No es polindroma");
        }

        if (esAnagrama(p1,p2)){
            System.out.println("Es anagrama");
        } else {
            System.out.println("No es anagrama");
        }

    }

    public static boolean  esPolindroma (String frase){
        // Convertimos a minúsculas y eliminamos espacios
        frase = frase.toLowerCase().replace(" ", "");

        // Invertimos la palabra
        String investida = new StringBuilder(frase).reverse().toString();

        //comparamos
        /*if(frase.equals(investida)){
            System.out.println("Es polindroma");
        } else {
            System.out.println("No es polindroma");
        }*/

        return frase.equals(investida);
    }

    public static boolean esAnagrama (String frase1, String frase2){
        frase1 = frase1.toLowerCase().replaceAll("\\s+", "");
        frase2 = frase2.toLowerCase().replaceAll("\\s+", "");

        //si no tienen la misma longitud no pueden ser anagramas
        if (frase1.length() != frase2.length()){
            return false;
        }

        //convertir a arreglo los caracteres y ordenar
        char[] arr1 = frase1.toCharArray();
        char[] arr2 = frase2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //comprobar arreglos
        return Arrays.equals(arr1,arr2);
    }
}
