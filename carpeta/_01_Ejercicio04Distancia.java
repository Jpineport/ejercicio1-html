package ud1.Ejercicios;

import java.util.Scanner;

public class _01_Ejercicio04Distancia {

    public static void main(String[] args) {
        
    /*
        Asumiendo que las coordenadas  son variables de tipo double 
     y realiza un programa que calcule la distancia entre dos puntos
     a partir de los datos solicitados por teclado al usuario.

    */
    // Entrada y declaracion variables.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce X1 y Y1");
        Double x1 = sc.nextDouble();
        Double y1 = sc.nextDouble();

        System.out.println("Introduce X2 y Y2");
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();

        sc.close();

    // Salida y operacion aritmetica.
        System.out.print("La distancia es : ");
        System.out.print(Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2)));


    }
}