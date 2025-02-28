import java;

public class TallerRecuperatorio {

    // Método para contar la cantidad de números iguales
    public static int contarIguales(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 0;
        }
    }

    // Método para generar un mensaje de saludo o despedida
    public static String generarMensaje(String nombre, int opcion) {
        if (opcion == 1) {
            return "Hola " + nombre;
        } else if (opcion == 0) {
            return "Chao " + nombre;
        } else {
            return "Error: entradas inválidas";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Ingrese tres números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Cantidad de números iguales: " + contarIguales(num1, num2, num3));

        // Ejercicio 2
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.next();
        System.out.println("Ingrese 1 para saludo o 0 para despedida:");
        int opcion = scanner.nextInt();
        System.out.println(generarMensaje(nombre, opcion));

        scanner.close();
    }
}
