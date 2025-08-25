package Ejercicio_02;

/*
* Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
* */

public class Extra {
    public static int numeros(String texto1, String texto2){
        int contador = 0;

        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(texto1 + " " + texto2);
            } else if (i % 3 == 0) {
                System.out.println(texto1);
            } else if (i % 5 == 0) {
                System.out.println(texto2);
            } else {
                System.out.println(i);
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        numeros("Gana multiplo de 3", "Gana multiplo de 5");
    }
}
