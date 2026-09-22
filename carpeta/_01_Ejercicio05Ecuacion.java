package ud1.Ejercicios;

import java.util.Scanner;

public class _01_Ejercicio05Ecuacion {
    public static void main(String[] args) {

        /*
         * Convierte esta fórmula en una expresión algorítmica en Java
         * para calcular ambas soluciones (x1 y x2),asumiendo que
         * a, b, y c son variables de tipo double.
         */

        // Entrada y Declaracion Variables.
        Scanner sc = new Scanner(System.in);
        System.out.println(" a:");
        double a = sc.nextDouble();
        System.out.println(" b:");
        double b = sc.nextDouble();
        System.out.println(" c:");
        double c = sc.nextDouble();
        sc.close();

        // Condicional.

        if (Math.pow(b, 2) - 4 * a * c < 0) {
            System.out.println("No tiene solucion real");
        } else {
            System.out.println("x1 = " + (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * b) / (2 * a)));
            System.out.println("x2 = " + (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * b) / (2 * a)));
        }

    }

}
