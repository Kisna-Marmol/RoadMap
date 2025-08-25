package Ejercicio_02;

public class Ejercicio02 {

    int variableInstancia; // Variable de instancia
    static int variableEstatica; // Variable estática, accesible globalmente dentro de la clase

    public void metodo1() {
        int variableLocal = 10; // Variable local
        variableInstancia = 20; // Accediendo a la variable de instancia
        variableEstatica = 30; // Accediendo a la variable estática
        System.out.println("Variable local: " + variableLocal);
    }

    public void metodo2() {
        // variableLocal no es accesible aquí
        System.out.println("Variable de instancia: " + variableInstancia);
        System.out.println("Variable estática: " + variableEstatica);
    }

    public static void metodoEstatico() {
        // variableLocal no es accesible aquí
        // variableInstancia no es accesible directamente aquí (necesita un objeto)
        System.out.println("Variable estática desde método estático: " + variableEstatica);
    }

    //funcion sin parametro ni retono
    public static void miFuncion(){
        //codigo a ejecutar
        System.out.println("Esta funcion cuenta sin parametros ni retornos");
    }

    //funciones con un paramentro
    public static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }

    //funciones con varios parametros y retorno

    public static int sumaNumeros(int n1, int n2){
        return n1 + n2;
    }


    // funcion similiar a una funcion anidada
    public static void metodoPrincipal(){
        System.out.println("Este es el metodo principal");
        metodoSecundario();
    }
    public static void metodoSecundario(){
        System.out.println("Este es el metodo secundario");
    }
    public static void main(String[] args) {
        int a = 5;
        int b =7;
        miFuncion(); //llamar a la funcion
        imprimirMensaje("Hola Java!");
        int resultado = sumaNumeros(a,b);
        System.out.println("resultado = " + resultado);

        /*
            No, no se pueden crear funciones dentro de otras funciones en Java,
            como se hace en lenguajes como JavaScript. En Java, los métodos (que son similares a las
            funciones) deben ser definidos dentro de una clase y no pueden anidarse dentro de otros métodos.

            En Java, la forma de lograr algo similar a funciones anidadas es a través de la creación de métodos
            estáticos dentro de una clase que pueden ser llamados desde otros métodos de la misma clase
         */

        metodoPrincipal();

        //ejemplo de una funcion ya creada en el sistema en esta ocasion con la clase Math
        int max = Math.max(a,b); //devuelve el mayor de dos numeros
        System.out.println("el mayor = " + max);

        //VAREABLES LOCALES Y GLOBALES

        /*
            En Java, las variables pueden ser locales o de instancia (globales simuladas).
            Las variables locales se definen dentro de un método o bloque de código y solo son accesibles
            dentro de ese ámbito. Las variables de instancia, aunque no son estrictamente globales en Java,
            se declaran dentro de una clase y son accesibles por todos los métodos de esa clase, actuando
            como variables globales dentro de la clase.

            VAREABLE LOCALES:
            - Se declaran dentro de un método o bloque de código específico.
            - Su ámbito de validez se limita a ese método o bloque.
            - No son accesibles desde fuera del método o bloque donde fueron declaradas.
            - Se crean cuando se entra al bloque y se destruyen cuando se sale de él.

            VAREABLES GLOBLAES (Simuladas):
            - Se declaran dentro de una clase, pero fuera de cualquier método.
            - Son accesibles por todos los métodos de la clase.
            - Cada instancia de la clase tiene su propia copia de estas variables.
            - Aunque no son globales a todo el programa, su acceso desde cualquier método de la clase
              las convierte en una especie de variable global dentro de la clase.
            - Para que sean accesibles desde cualquier clase, se pueden declarar como public static.
         */

        Ejercicio02 ejemplo = new Ejercicio02();
        ejemplo.metodo1();
        ejemplo.metodo2();
        Ejercicio02.metodoEstatico(); // Accediendo al método estático
    }
}
