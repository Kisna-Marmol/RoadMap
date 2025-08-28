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
                    age.add(nombre);
                    System.out.println("Ingrese el numero de telefono:");
                    String telefono = s.nextLine();
                    age.add(telefono);

                    agenda.put(nombre,telefono);

                    esperarTecla(s);
                    break;
                case 5:
                    System.out.println("LISTA DE CONTACTOS");
                    System.out.println(agenda);

                    System.out.println("ArrayList");
                    for (int i = 0; i < age.size(); i++){
                        System.out.println("Nombre = "+age.get(i) +", telefono = "+age.get(i+1));
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
