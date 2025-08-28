package Ejercicio_01;

public class Ejercicio_01 {
    public static void main(String[] args) {
        System.out.println("=== OPERADORES EN JAVA ===");

        // 🔹 Operadores Aritméticos
        int a = 10, b = 3;
        System.out.println("Suma: " + (a + b));        // 13
        System.out.println("Resta: " + (a - b));       // 7
        System.out.println("Multiplicación: " + (a * b)); // 30
        System.out.println("División: " + (a / b));    // 3
        System.out.println("Módulo: " + (a % b));      // 1

        // 🔹 Operadores de Comparación
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a > b: " + (a > b));    // true
        System.out.println("a < b: " + (a < b));    // false

        // 🔹 Operadores Lógicos
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));  // false
        System.out.println("x || y: " + (x || y));  // true
        System.out.println("!x: " + (!x));          // false

        // 🔹 Operadores de Asignación
        int c = 5;
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c);  // 8
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);  // 16

        // 🔹 Operadores de Bits
        int m = 6, n = 3; // binario: m=110, n=011
        System.out.println("m & n: " + (m & n)); // AND → 010 = 2
        System.out.println("m | n: " + (m | n)); // OR  → 111 = 7
        System.out.println("m ^ n: " + (m ^ n)); // XOR → 101 = 5
        System.out.println("~m: " + (~m));       // NOT → -7
        System.out.println("m << 1: " + (m << 1)); // Desplazamiento izq → 12
        System.out.println("m >> 1: " + (m >> 1)); // Desplazamiento der → 3

        // 🔹 "Identidad" en Java → con objetos (== compara referencias, equals() compara contenido)
        String s1 = new String("hola");
        String s2 = new String("hola");
        System.out.println("s1 == s2: " + (s1 == s2));       // false (referencias distintas)
        System.out.println("s1.equals(s2): " + (s1.equals(s2))); // true (contenido igual)

        // 🔹 "Pertenencia" en Java → usando contains() en colecciones o strings
        String texto = "programar en java";
        System.out.println("Contiene 'java': " + texto.contains("java")); // true

        System.out.println("\n=== ESTRUCTURAS DE CONTROL EN JAVA ===");

        // 🔹 Condicional if-else
        if (a > b) {
            System.out.println("a es mayor que b");
        } else {
            System.out.println("b es mayor o igual que a");
        }

        // 🔹 Switch
        int opcion = 2;
        switch (opcion) {
            case 1 -> System.out.println("Opción 1 seleccionada");
            case 2 -> System.out.println("Opción 2 seleccionada");
            default -> System.out.println("Opción no válida");
        }

        // 🔹 Bucle for
        System.out.println("Bucle for:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 🔹 Bucle while
        System.out.println("Bucle while:");
        int contador = 3;
        while (contador > 0) {
            System.out.print(contador + " ");
            contador--;
        }
        System.out.println();

        // 🔹 Bucle do-while
        System.out.println("Bucle do-while:");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 3);
        System.out.println();

        // 🔹 Try-Catch (Excepciones)
        try {
            int division = a / 0; // error de división por cero
            System.out.println("Resultado: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida");
        } finally {
            System.out.println("Bloque finally ejecutado (opcional)");
        }
    }
}
