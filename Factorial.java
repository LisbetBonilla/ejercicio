package com.tiernoparla.ejercicioelementales;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("Introduce un número: ");
        num = numero.nextInt();
        factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;

        }
        System.out.println("El factorial de " + num + " es: " + factorial);

    }
}
