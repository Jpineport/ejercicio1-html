package ud1.Ejercicios;

import java.util.Scanner;

public class _01_Ejercicio02Par {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int intTyped = sc.nextInt();
        sc.close();

        if (intTyped % 2 == 0) { // % El operador % nos da el resto.
            System.out.println(intTyped + " es par");
        } else {
            System.out.println(intTyped + " es impar");
        }

    }
}
