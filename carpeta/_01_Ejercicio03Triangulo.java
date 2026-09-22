package ud1.Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _01_Ejercicio03Triangulo {
    public static void main(String[] args) {

        /*
         * Realiza un programa que calcule el área de un triángulo
         * a partir de los datos de base (b) y altura (h) solicitados por teclado.
         */

        // Entrada y Declaracion Variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura del triangulo:");
        Double heightT = sc.nextDouble();
        System.out.println("Base del triangulo:");
        Double baseT = sc.nextDouble();
        sc.close();

        // Calculo Area
        System.out.println("El area es : " + (heightT * baseT / 2));
        // Calculo Area pero usando formato decimal
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("El area es : " + df.format(heightT * baseT / 2));

    }
}
