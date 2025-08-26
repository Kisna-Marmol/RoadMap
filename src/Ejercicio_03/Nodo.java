package Ejercicio_03;

//clase que representa el nodo del arbol
public class Nodo {
    int valor; //Dato que almacena el nodo
    Nodo izquierdo; //Referencia al hijo izquierdo
    Nodo derecho; //Referencia al hijo derecho

    //Constructor del nodo
    public Nodo(int valor){
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }


}
