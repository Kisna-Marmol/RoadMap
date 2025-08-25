package Ejercicio_03;

import java.util.LinkedList;
import java.util.Scanner;

public class Grafo {

    Scanner s = new Scanner(System.in);
    private int V; //numero de vertices
    private LinkedList<Integer>[] listaAdyacente; //Lista de adyacencia para almacenar las conexiones


    // Constructor para inicializar el grafo con un número dado de vértices
    public Grafo(int v){
        V = v;
        listaAdyacente = new LinkedList[v];
        for (int i = 0; i < v; i++){
            listaAdyacente[i] = new LinkedList<>();
        }
    }

    //Metodo para agregar una artista al grafo
    public void agregarArista(int v, int w){
        listaAdyacente[v].add(w);
        listaAdyacente[w].add(v);
    }

    //Metodo para imprimir el grafo
    public void imprimirGrafo(){
        for (int i = 0; i < V; i++){
            System.out.println("Lista de adyaciencia del vertice " + i);
            System.out.println("Vertice " + i);
            for (Integer nodoAdyacente : listaAdyacente[i]){
                System.out.println(" -> " + nodoAdyacente);
            }
            System.out.println("\n");
        }
    }

}
