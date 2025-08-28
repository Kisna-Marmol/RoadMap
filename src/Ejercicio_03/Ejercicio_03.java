package Ejercicio_03;

public class Ejercicio_03 {
    public static void main(String[] args) {
        EstrucutrasDeDatos nuevo = new EstrucutrasDeDatos();
        /*
            Qué son las estructuras de datos en Java
            Las estructuras de datos son elementos fundamentales
            en la programación que permiten almacenar y organizar datos de una forma eficiente.
         */

        //ESTRUCTURAS DE DATOS

        //Arreglos
        /*
            es una estructura de datos que permite almacenar una colección de elementos del mismo tipo,
            a los cuales se puede acceder mediante un índice numérico. Son útiles para organizar y manipular
            grandes cantidades de datos de manera eficiente.
         */
        //nuevo.arreglos();

        //Arrays List
        /*
            Un ArrayList en Java es una estructura de datos dinámica que permite almacenar una colección de
            objetos. Se diferencia de los arrays tradicionales en que su tamaño puede cambiar durante la
            ejecución del programa, permitiendo agregar o eliminar elementos según sea necesario.
         */
        //nuevo.arrayList();

        //HashMap
        /*
            Se utiliza para almacenar pares clave-valor y proporciona un rendimiento en tiempo constante
            para operaciones básicas como añadir, eliminar y recuperar elementos. HashMap es muy eficiente
            y se suele utilizar cuando se requiere la asociación única de claves a valores.
         */
        //nuevo.hashMap();

        //Grafo
        /*
            Un grafo es una estructura de datos que consta de nodos (vértices) y aristas (conexiones entre
            los nodos). En Java, puedes implementar un grafo utilizando varias estructuras de datos, como
            listas de adyacencia o matrices de adyacencia.
         */
        //nuevo.grafo();

        //Pila
        /*
            Este tipo de estructura siguen el principio “LIFO” (último en entrar, primero en salir). La
            clase Stack en Java es un ejemplo de una pila.

            Es útil para tareas como el procesamiento de expresiones matemáticas o en la ejecución de
            programa de terceros en la que es necesario gestionar dependencias de terceros.
         */
        //nuevo.pilas();

        //Cola
        /*
            Las colas siguen el principio “FIFO” (primero en entrar, primero en salir). Pueden ser
            implementadas como PriorityQueue o LinkedList.

            Son útiles en situaciones donde el orden de llegada es relevante, el ejemplo típico, es la cola
            de tareas de la bandeja de impresión.
         */
        //nuevo.colas();

        //Arboles
        /*
            Son estructuras de datos jerárquicas que se utilizan para organizar datos de manera eficiente.
            Los árboles binarios, como el árbol de búsqueda binaria, son ejemplos comunes en Java y son
            esenciales en algoritmos de búsqueda y ordenación.

            Son indicados para grandes conjuntos de datos donde la consulta necesita de grandes recursos.
         */
        nuevo.arbol();
    }
}
