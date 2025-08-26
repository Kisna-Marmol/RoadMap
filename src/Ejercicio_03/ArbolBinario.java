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

    //Metodo para eliminar el valor de un arbol
    public void eliminar(int valor){
        raiz = eliminarRecursivo(raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo actual, int valor){
        if (actual == null) return null; //Nodo no encontrado

        if (valor < actual.valor){
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = eliminarRecursivo(actual.derecho, valor);
        } else {
            // Nodo encontrado → tres casos
            // 1. Nodo sin hijos
            if (actual.izquierdo == null && actual.derecho == null){
                return null;
            }

            // 2. Nodo con un hijo
            if(actual.izquierdo == null) return actual.derecho;
            if (actual.derecho == null) return actual.izquierdo;

            // 3. Nodo con dos hijos
            int minValor = encontrarMinimo(actual.derecho);
            actual.valor = minValor;
            actual.derecho = eliminarRecursivo(actual.derecho, minValor);
        }
        return actual;
    }

    //Metodo auxiliar para encontrar el valor minimo en un subArbol
    public int encontrarMinimo(Nodo nodo){
        while (nodo.izquierdo != null){
            nodo = nodo.izquierdo;
        }
        return nodo.valor;
    }

    //Metodo para actualizar un valor
    public void actualizar(int valorAntiguo, int valorNuevo){
        //Eliminar el valor antiguo
        eliminar(valorAntiguo);

        //Insertar nuevo valor
        insertar(valorNuevo);
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
