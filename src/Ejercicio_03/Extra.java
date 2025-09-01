package Ejercicio_03;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();
        ArrayList<String> age = new ArrayList<>();
        String menu = "AGENDA"+
                "\n1. Insertar"+
                "\n2. Buscar"+
                "\n3. Actualizar"+
                "\n4. Eliminar"+
                "\n5. Mostrar"+
                "\n0. Salir"+
                "\nSeleccione una opcion:";
        int opcion = 0;

        do {
            System.out.println(menu);
            opcion = s.nextInt();

            switch (opcion){
                case 1:
                    s.nextLine();
                    System.out.println("AGREGAR CONTACTO");
                    System.out.println("Ingrese el nombre:");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el numero de telefono:");
                    String telefono = s.nextLine();

                    if (telefono.matches("\\d+") && telefono.length() <= 8){ // \\d+ busca uno o mas digitos
                        agenda.put(nombre,telefono);
                    }else {
                        System.err.println("Error: El numero de telefono contiene datos no numericos o es muy largo.");
                    }

                    esperarTecla(s);
                    break;

                case 2:
                    s.nextLine();
                    System.out.println("Ingrese el nombre del contacto a buscar:");
                    String contacto = s.nextLine();

                    String resultado = agenda.get(contacto);

                    if (resultado != null){
                        System.out.println("CONTACTO");
                        System.out.println("Nombre = " + contacto + ", Numero = " + resultado);
                    } else {
                        System.out.println("No se encontro resultado.");
                    }

                    esperarTecla(s);
                    break;
                case 3:
                    s.nextLine();
                    System.out.println("Ingrese el nombre del contacto a actualizar:");
                    String actualizar = s.nextLine();
                    System.out.println("Ingrese el nuevo numero:");
                    String nuevoNumero = s.nextLine();

                    agenda.replace(actualizar,nuevoNumero);

                    esperarTecla(s);
                    break;
                case 4:
                    //Para eliminar un elemento, utilice el remove()método y consulte la clave:
                    System.out.println("¿Deseas eliminar un (1. elemento o 0. todos)?");
                    int desicion = s.nextInt();
                    s.nextLine();
                    if(desicion == 1){
                        System.out.println("Ingrese el nombre de contacto a buscar:");
                        String buscar = s.nextLine();

                        resultado = agenda.remove(buscar);

                        if (resultado != null){
                            System.out.println("El contacto '"+buscar+"' con numero '"+resultado+"' eliminado correctamente.");
                        }else {
                            System.err.println("No se pudo eliminar el contacto.");
                        }
                    } else if (desicion == 0) {
                        agenda.clear();
                        System.out.println("Datos eliminados exitosamente.");
                    }
                    esperarTecla(s);
                    break;
                case 5:
                    System.out.println("LISTA DE CONTACTOS");
                    for (var entry : agenda.entrySet()){
                        System.out.println("Nombre = "+entry.getKey()+", Numero = "+entry.getValue());
                    }

                    esperarTecla(s);
                    break;
                case 0:
                    System.out.println("Saliendo de sistema...");
                    System.exit(0);
                default:
                    System.err.println("Error: Opcion invalida.");
            }
        }while (opcion != 0);
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
