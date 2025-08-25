package Ejercicio_03;

import java.util.*;

public class EstrucutrasDeDatos {
    Scanner s = new Scanner(System.in);
    final String mensaje = "MENU"+
            "\n1. Insertar"+
            "\n2. Buscar"+
            "\n3. Borrar"+
            "\n4. Actualizar"+
            "\n5. Ordenar"+
            "\n6. Mostrar"+
            "\n0. Salir" +
            "\nSeleccione una opcion:";
    int opcion = 0;

    public void arreglos(){
        int[] numero = new int[6];
        int posicion = 0;
        int controlador = 0;

        do {
            System.out.println("MENU"+
                    "\n1. Insertar"+
                    "\n2. Buscar"+
                    "\n3. Borrar"+
                    "\n4. Actualizar"+
                    "\n5. Ordenar"+
                    "\n6. Mostrar"+
                    "\n0. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = s.nextInt();
            //limpiar
            System.out.print("\033[H\033[2J");
            System.out.flush();
            switch (opcion){
                case 1:
                    //insertar
                    System.out.println("Ingrese seis numeros:");
                    for (int i = 0; i < numero.length; i++){
                        numero[i] = s.nextInt();
                    }
                    break;
                case 2:
                    //Buscar
                    System.out.println("\r\nIngrese un numero a buscar: ");
                    int num = s.nextInt();
                    int k = 0;
                    for (; k < numero.length && numero[k] != num; k++){}
                    if (k == numero.length){
                        System.out.println("Numero no encontrado.");
                    } else if (numero[k] == num) {
                        System.out.println("Encontrado en la posicion " + k);
                    }
                    break;
                case 3:
                    //Eliminar
                    System.out.println("Ingrese la posicion del numero a eliminar de (0 - 5):");
                    posicion = s.nextInt();
                    for (int i = posicion; i < numero.length - 1; i++){
                        numero[i] = numero[i+1]; //se desplaza
                    }

                    controlador = 1;
                    break;
                case 4:
                    //Actualizar
                    System.out.println("Ingrese la posicion del numero a actualizar de (0 - 5):");
                    posicion = s.nextInt();
                    System.out.println("Ingrese el nuevo numero:");
                    int nuevo = 0;
                    nuevo = s.nextInt();
                    for (int i = posicion; i < numero.length - 1; i++){
                        numero[posicion] = nuevo;
                    }
                    break;
                case 5:
                    //Ordenar
                    System.out.println("Ordenar de forma 1. ASC o 2. DES:");
                    int seleccion = s.nextInt();
                    Arrays.sort(numero);
                    if (seleccion == 1){
                        System.out.println("Orden Ascendente:");
                        //ordenamiento burbuja
                        for (int i = 0; i < numero.length; i++){ //controla las pasadas
                            for(int j = 0; j < numero.length - 1 - i; i++){//compara pares
                                if(numero[j] > numero[j + 1]){//si estan mal ordenados
                                    int aux = numero[j]; //intercambia
                                    numero[j] = numero[j + 1];
                                    numero[j + 1] = aux;
                                }
                            }
                        }
                    } else if (seleccion == 2) {
                        System.out.println("Orden Descendente:");
                        for (int i = 0; i < numero.length; i++){ //controla las pasadas
                            for(int j = 0; j < numero.length - 1 - i; i++){//compara pares
                                if(numero[j] < numero[j + 1]){//si estan mal ordenados
                                    int aux = numero[j]; //intercambia
                                    numero[j] = numero[j + 1];
                                    numero[j + 1] = aux;
                                }
                            }
                        }
                    }
                case 6:
                    if(controlador == 0){
                        //Mostrar
                        System.out.println("Lista de numeros:");
                        for (int j = 0; j < numero.length; j++){
                            System.out.println(numero[j]);
                        }
                    } else if (controlador == 1) {
                        //Mostrar
                        System.out.println("Lista de numeros:");
                        for (int j = 0; j < numero.length; j++){
                            System.out.println(numero[j]);
                        }
                    }

                    break;
                case 0:
                    System.out.println("Saliendo de sistema...");
                    System.exit(0);
                default:
                    System.out.println("Error: Opcion no valida");

            }
        }while (opcion !=0);

        s.close();
    }

    public void arrayList(){
        //crear arrayList
        /*ArrayList utiliza la clase wrapper correspondiente de los tipos de datos primitivos para que
        sean tratados como objetos. Por lo tanto, necesitamos especificar Integer en lugar de int.*/
        ArrayList<Integer> numeros = new ArrayList<>();
        int num = 0;
        int posicion = 0;

        do {
            System.out.println(mensaje);
            opcion = s.nextInt();

            switch (opcion){
                case 1:
                    //Insertar
                    System.out.println("¿Cuantos elemento va agregar?");
                    int elemento = s.nextInt();
                    for (int i = 0; i < elemento; i++){
                        System.out.println("Agregando:");
                        int numero = s.nextInt();
                        numeros.add(numero);
                    }
                    esperarTecla(s);
                    break;
                case 2:
                    //Buscar
                    /*
                        Para buscar un elemento en un ArrayList en Java, se puede utilizar el método
                        contains() para verificar si el elemento existe en la lista, o el método indexOf()
                        para obtener la posición (índice) del elemento.
                     */
                    System.out.println("\r\nIngrese un numero a buscar: ");
                    num = s.nextInt();

                    //con indexOf() que devuelve el índice de la primera ocurrencia del elemento buscado,
                    // o -1 si no se encuentra.

                    posicion = numeros.indexOf(num);

                    if (posicion != -1){
                        System.out.println(num + " se encuentra en la posicion: " + posicion);
                    } else {
                        System.out.println(num + " no se encuentra en la lista.");
                    }

                    /*
                        contains(Object o): Devuelve true si la lista contiene el objeto especificado, y
                        false en caso contrario.
                     */

                    /*if (numeros.contains(num)){
                        System.out.println(num + " se encuentra en la lista.");
                    } else {
                        System.out.println(num + " no se encuentra en la lista");
                    }*/

                    /*
                    Iteradores: Permiten recorrer la lista y comparar cada elemento con el elemento buscado.
                     */

                    //boolean encontrado = false;

                    /*Iterator<Integer> it = numeros.iterator();

                    while (it.hasNext()){
                        if (it.next().equals(num)){
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado){
                        System.out.println(num + " encontrado.");
                    }else {
                        System.out.println(num + " no encontrado.");
                    }*/

                    /*
                        Bucles: Similar a los iteradores, pero utilizando un bucle for.
                     */

                    /*for (int i = 0; i < numeros.size(); i++){
                        if (numeros.get(i).equals(num)){
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado){
                        System.out.println(num + " encontrado.");
                    }else {
                        System.out.println(num + " no encontrado.");
                    }*/

                    esperarTecla(s);

                    break;
                case 3:
                    //Borrar

                    System.out.println("\r\nIngrese un numero a eliminar: ");
                    num = s.nextInt();

                    boolean eliminar = numeros.remove(Integer.valueOf(num)); // Integer.valueOf() para que elimine el valor y no el indice

                    esperarTecla(s);

                    break;
                case 4:
                    //Actualizar

                    System.out.println("\r\nIngrese un numero a actualizar: ");
                    num = s.nextInt();

                    //con indexOf() que devuelve el índice de la primera ocurrencia del elemento buscado,
                    // o -1 si no se encuentra.

                    posicion = numeros.indexOf(num);

                    if (posicion != -1){
                        //System.out.println(num + " se encuentra en la posicion: " + posicion);
                        System.out.println("Ingrese el nuevo numero:");
                        int nuevo = s.nextInt();

                        numeros.set(posicion, nuevo);
                    } else {
                        System.out.println(num + " no se encuentra en la lista.");
                    }

                    esperarTecla(s);
                    break;
                case 5:
                    //Ordenar
                    numeros.sort(null);
                    break;
                case 6:
                    //Mostrar
                    System.out.println("Lista: \n"+numeros);
                    esperarTecla(s);
                    break;
                case 0:
                    System.out.println("Saliendo de sistema...");
                    System.exit(0);
                default:
                    System.out.println("Error: Opcion no valida");
            }
        }while (opcion != 0);

        s.close();
    }

    public void hashMap(){
        /*
            Una lata HashMappuede almacenar muchas combinaciones diferentes, como por ejemplo:

            * Stringclaves y Integervalores
            * Stringclaves y Stringvalores


         */
        HashMap <String, String> ciudades = new HashMap<>();
        String clave = ""; //Departamentos
        String valor = ""; //municipios o cabeceras
        int opcion = 0;
        String buscar = "";
        String resultado = "";

        do {
            System.out.println(mensaje);
            opcion = s.nextInt();

            switch (opcion){
                case 1:
                    //Insertar
                    System.out.println("¿Cuantos elemento va agregar?");
                    int elemento = s.nextInt();
                    s.nextLine(); //para limpiar buffer
                    for (int i = 0; i < elemento; i++){
                        System.out.println("Ingrese el departamento:");
                        clave = s.nextLine();
                        System.out.println("Ingrese la cabecera:");
                        valor = s.nextLine();

                        ciudades.put(clave,valor); //se usa put para agregar
                    }
                    //Nota: si se agrega la misma clave (como "Noruega") más de una vez, el último valor
                    // sobrescribirá el anterior, porque las claves en a HashMapdeben ser únicas.
                    esperarTecla(s);
                    break;
                case 2:
                    s.nextLine();
                    //Buscar
                    //Para acceder a un valor en HashMap, utilice el get()método y haga referencia a su clave:
                    System.out.println("Ingrese el departamento a buscar:");
                    buscar = s.nextLine();

                    resultado = ciudades.get(buscar);

                    if (resultado != null){
                        System.out.println("Cabecera: "+resultado);
                    }else {
                        System.out.println("No se encontro el departamento o cabecera.");
                    }

                    esperarTecla(s);

                    break;
                case 3:
                    s.nextLine();
                    //Borrar
                    //Para eliminar un elemento, utilice el remove()método y consulte la clave:
                    System.out.println("¿Deseas eliminar un (1. elemento o 0. todos)?");
                    int desicion = s.nextInt();
                    s.nextLine();
                    if(desicion == 1){
                        System.out.println("Ingrese el departamento a buscar:");
                        buscar = s.nextLine();

                        resultado = ciudades.remove(buscar);

                        if (resultado != null){
                            System.out.println("Cabecera: "+resultado+" eliminada correctamente.");
                        }else {
                            System.err.println("No se pudo eliminar el departamento o cabecera.");
                        }
                    } else if (desicion == 0) {
                        ciudades.clear();
                        System.out.println("Datos eliminados exitosamente.");
                    }
                    esperarTecla(s);

                    break;
                case 4:
                    s.nextLine();
                    //Actualizar
                    String valorNuevo = "";
                    System.out.println("Ingrese el departamento a buscar:");
                    buscar = s.nextLine();

                    resultado = ciudades.get(buscar);

                    if (resultado != null){
                        System.out.println("Ingrese el departamento:");
                        clave = s.nextLine();
                        System.out.println("Ingrese la cabecera:");
                        valor = s.nextLine();
                        System.out.println("Ingrese la nueva cabecera:");
                        valorNuevo = s.nextLine();
                        ciudades.replace(clave,valor,valorNuevo); //clave = departamento, valorAntiguo = cabecera, valorNuevo = nueva cabecera
                    } else {
                        System.err.println("Datos no encontrados.");
                    }

                    esperarTecla(s);
                    break;
                case 5:
                    //Ordenar
                    /*
                    un HashMap es una estructura dinámica, donde tenemos elementos asociados por clave y
                    valor.

                    Algo normal que suele pasar, es que queramos ordenar los elementos.

                    El truco esta en usar la clase TreeMap, que es igual que HashMap pero esta ordena los
                    elementos de forma automática, pero si queremos ordenarlo de una forma concreta se lo
                    debemos indicar.
                     */

                    TreeMap<String, String> ordenar = new TreeMap<>();

                    ordenar.putAll(ciudades);
                    //los ordena de forma ascendente
                    for(String key: ordenar.keySet()){
                        System.out.println("Clave: "+key+", valor: "+ordenar.get(key));
                    }

                    esperarTecla(s);
                    break;
                case 6:
                    //Mostrar
                    System.out.println("DEPARTAMENTOS & CIUDADES:");
                    System.out.println(ciudades);

                    esperarTecla(s);
                    break;
                case 0:
                    System.out.println("Saliendo de sistema...");
                    System.exit(0);
                default:
                    System.out.println("Error: Opcion no valida");
            }
        }while (opcion != 0);

        s.close();

    }

    public void grafo(){
        Grafo gra = new Grafo(5); //Crear un grafo con 5 vertices

        //Agregar Aristas al grafo

        gra.agregarArista(0,1);
        gra.agregarArista(0,4);
        gra.agregarArista(1,2);
        gra.agregarArista(1,3);
        gra.agregarArista(1,4);
        gra.agregarArista(2,3);


        //imprimir grafo
        gra.imprimirGrafo();
    }

    public void pilas(){
        /*
            En este ejemplo implementamos una estructura de tipo Pila a partir de la clase Stack,
            se realizan operaciones como inserción o la obtención de elementos.
         */
        Stack<String> pila = new Stack<>();

        String mensaje = "MENU"+
                "\n1. Insertar"+
                "\n2. Borrar"+
                "\n3. Mostrar"+
                "\n0. Salir" +
                "\nSeleccione una opcion:";

        do {
            System.out.println(mensaje);
            opcion = s.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese cuantos datos va ingresar:");
                    int cantidad = s.nextInt();
                    System.out.println("Ingrese las letas:");
                    for (int i = 0; i < cantidad; i++){
                        //s.nextLine();
                        String letra = s.nextLine();

                        pila.push(letra);
                    }
                    esperarTecla(s);
                    break;
                case 2:
                    //Obtener y eliminar el elemento en la cima
                    String elementoCima = pila.pop();
                    System.out.println("Elemento en la cima de la pila: "+ elementoCima +" eliminado.");
                    esperarTecla(s);
                    break;
                case 3:

                    System.out.println("Contenido de la pila:");
                    System.out.println(pila);
                    esperarTecla(s);
                    break;
                case 0:
                    System.out.println("Saliendo de sistema...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Opcion Inconrrecta.");
            }

        }while (opcion != 0);
    }

    public void colas(){
        Queue<String> cola = new LinkedList<>();
        String mensaje = "MENU"+
                "\n1. Insertar"+
                "\n2. Borrar"+
                "\n3. Mostrar"+
                "\n0. Salir" +
                "\nSeleccione una opcion:";

        do {
            System.out.println(mensaje);
            opcion = 0;

            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad de elementos a ingresar:");
                    int cantidad = s.nextInt();
                    System.out.println("Ingrese las letras:");
                    for (int i = 0; i < cantidad; i++){
                        String letra = s.nextLine();

                        cola.offer(letra); //offer para añadir a la cola
                    }
                    esperarTecla(s);
                    break;
                case 2:
                    // Obtener y eliminar el elemento al frente de la cola
                    String elementoFrente = cola.poll();
                    System.out.println("Elemento al frente de la cola "+elementoFrente+" eliminado.");
                    esperarTecla(s);
                    break;
                case 3:
                    System.out.println("Contenido de la cola: \n"+cola);
                    esperarTecla(s);
                    break;
                case 0:
                    System.out.println("Saliendo de Sistema..");
                    System.exit(0);
                default:
                    System.err.println("Error: Opcion no valida.");
            }
        }while (opcion != 0);

        s.close();
    }

    //Método para esperar que el usuario presione una tecla
    private static void esperarTecla(Scanner sc) {
        System.out.println("\nPresiona ENTER para continuar...");
        try {
            sc.nextLine(); // limpia el buffer
            sc.nextLine(); // espera el ENTER
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
