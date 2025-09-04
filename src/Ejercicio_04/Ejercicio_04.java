package Ejercicio_04;

public class Ejercicio_04 {
    public static void main(String[] args) {
        String texto = "Hola Mundo";

        //1. Longitud
        System.out.println("Longitud = "+ texto.length());

        //2. Acceso a un caracter especifico (indices desde 0)
        System.out.println("Caracter en la posicion 0 = "+texto.charAt(0));

        //3. Subcadenas
        System.out.println("Subcadena (0,4): "+ texto.substring(0,4)); //Hola

        //4. Concatenacion
        String saludo = "Hola";
        String nombre = "Kisna";
        System.out.println("Concatenacion: "+saludo+" "+nombre);

        //5. Repeticion (usando repeat en java 11+)
        System.out.println("Repeticion: "+saludo.repeat(3));

        //6. Recorrido caracter por caracter
        System.out.println("Recorrido:");
        for (char c : texto.toCharArray()){
            System.out.println(c + " ");
        }
        System.out.println();

        //7. Conversion a mayusculas y minusculas
        System.out.println("Mayusculas: " + texto.toUpperCase());
        System.out.println("Minusculas: " + texto.toLowerCase());

        //8. Remplazo
        System.out.println("Remplazo: " + texto.replace("Mundo","Java"));

        //9. Division (split)
        String frase = "uno,dos,tres,cuatro";
        String [] partes = frase.split(",");
        System.out.println("Split:");
        for (String p : partes){
            System.out.println(p);
        }

        //10. Union (join)
        String union = String.join(" - ",partes);
        System.out.println("Join: " + union);

        //11. Interpolacion (con String.format)
        int edad = 25;
        String interpolado = String.format("Me llamo %s y tengo %d años ", nombre, edad);
        System.out.println("Interpolacion: " + interpolado);

        //12. Verificaciones
        System.out.println("¿Empieza con 'Hola'? " + texto.startsWith("Hola"));
        System.out.println("¿Termina con 'Mundo'? " + texto.endsWith("Mundo"));
        System.out.println("¿Contiene 'Mun'? " + texto.contains("Mun"));
        System.out.println("¿Esta vacio? " + texto.isEmpty());
        System.out.println("¿Igual a 'hola mundo'? " + texto.equals("hola mundo"));
        System.out.println("¿Igual sin importar mayusculas? " + texto.equalsIgnoreCase("hola mundo"));

        //13. Quitar espacios extremos
        String conEspacios = "  Hola  ";
        System.out.println("Trim: '" + conEspacios.trim() + "'");

        //14. Reemplazo usando regex
        String numeros = "abc123def456";
        System.out.println("Solo letras: " + numeros.replaceAll("[0-9]",""));
        System.out.println("Solo numeros: " + numeros.replaceAll("[^0-9]",""));

        //15. Conversion de String a numeros y viceversa
        String numTexto = "42";
        int numero = Integer.parseInt(numTexto);
        System.out.println("String a numeros: " + (numero + 1));
        String numCadena = String.valueOf(99);
        System.out.println("Numero a String: " + numCadena);

        //16. Comparaciones Lexicograficas
        String a = "abc", b = "abd";
        System.out.println("Comparacion: " + a.compareTo(b)); // <0 si a < b

        //17. Formateo con printf
        System.out.printf("Formateo Printf: Nombre=%s, Edad=%d%n", nombre, edad);


        /*
            Operaciones que cubre:

            Acceso por índice → charAt

            Subcadenas → substring

            Longitud → length

            Concatenación → +

            Repetición → repeat

            Recorrido → toCharArray o for

            Mayúsculas / Minúsculas → toUpperCase, toLowerCase

            Reemplazo → replace, replaceAll

            División → split

            Unión → String.join

            Interpolación → String.format, printf

            Verificación → startsWith, endsWith, contains, isEmpty, equals, equalsIgnoreCase

            Quitar espacios → trim

            Conversión String <-> Número → parseInt, valueOf

            Comparación lexicográfica → compareTo
         */
    }
}
