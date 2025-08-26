package Ejercicio_03;

//clase que representa el Arbol Binario
public class ArbolBinario {
    Nodo raiz; // Nodo principal (raiz) del arbol

    //constructor del arbol vacio
    public ArbolBinario(){
        raiz = null;
    }

    //Metodo para insertar un nuevo valor al arbol
    public void insertar(int valor){
        raiz = insertarRecursivo(raiz, valor);
    }

    //insercion recursiva
    private Nodo insertarRecursivo(Nodo actual, int valor){
        //si el nodo actual es null, creamos un nuevo nodo
        if (actual == null){
            return new Nodo(valor);
        }

        //Decidimos si va a la izquierda o a la derecha
        if (valor < actual.valor){
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        //si el valor ya existe no lo insertamos (opcional)
        return actual;
    }

    // Recorrido In-Order (izquierda, raíz, derecha)
    public void inOrder(Nodo nodo){
        if (nodo != null){
            inOrder(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrder(nodo.derecho);
        }
    }

    // Recorrido Pre-Order (raíz, izquierda, derecha)
    public void preOrder(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo.valor + " ");
            preOrder(nodo.izquierdo);
            preOrder(nodo.derecho);
        }
    }

    // Recorrido Post-Order (izquierda, derecha, raíz)
    public void postOrder(Nodo nodo){
        postOrder(nodo.izquierdo);
        postOrder(nodo.derecho);
        System.out.print(nodo.valor + " ");
    }
}
