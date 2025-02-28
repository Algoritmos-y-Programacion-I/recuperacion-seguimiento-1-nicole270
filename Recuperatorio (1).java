
import java.util.Scanner;

public class Recuperatorio {
    private Scanner escaner;
 
    

	private Recuperatorio() {
		escaner = new Scanner(System.in);
	}
	

    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        
        // ACTIVIDAD 1
      int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Cantidad de números iguales: " + contarIguales(num1, num2, num3));
        
        
        
    
    

    //ACTIVIDAD #2
             
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese 1 para saludo o 0 para despedida:");
        int opcion = scanner.nextInt();
        System.out.println(generarMensaje(nombre, opcion));

        scanner.close();
        
        

        //ACTIVIDAD #3

            System.out.print("Ingrese una palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        System.out.print("Ingrese la tercera palabra: ");
        String palabra3 = scanner.nextLine();
        
    
        int cantidad = contarPalabrasLargas(palabra1, palabra2, palabra3);
        System.out.println("Cantidad de palabras con 4 o más caracteres: " + cantidad);

        //ACTIVIDAD #4

             System.out.println("Ingrese dos palabras para comparar la tercera letra:");
        String cadena1 = scanner.next();
        String cadena2 = scanner.next();
        System.out.println(compararPosicionDos(cadena1, cadena2));
        

        //ACTIVIDAD 5

        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();
        
        calcularRaices(a, b, c);
      
    
    }

public static void main(String[] args)  {
    
		Recuperatorio mainApp = new Recuperatorio();
		mainApp.run();
	}

    
    public static int contarIguales(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 0;
        }
    
    }
    public static String generarMensaje(String nombre, int opcion) {
        if (opcion == 1) {
            return "Hola " + nombre;
        } else if (opcion == 0) {
            return "Chao " + nombre;
        } else {
            return "Error entradas inválidas";
        }
    }
      public static int contarPalabrasLargas(String str1, String str2, String str3) {
        int count = 0;
        if (str1.length() >= 4) count++;
        if (str2.length() >= 4) count++;
        if (str3.length() >= 4) count++;
        return count;
    }

     
    public static String compararPosicionDos(String str1, String str2) {
        if (str1.length() < 3 || str2.length() < 3) {
            return "Error: Ambas cadenas deben tener  3 caracteres o mas";
        }
        return str1.charAt(2) == str2.charAt(2) ? "true" : "false";
    }
    public static void calcularRaices(double a, double b, double c) {
        double resultado = Math.pow(b, 2) - 4 * a * c;
        if (resultado > 0) {
            double raiz1 = (-b + Math.sqrt(resultado)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(resultado)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (resultado == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz: " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces");
        }
    }
}





	

