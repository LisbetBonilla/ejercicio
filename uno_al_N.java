package com.tiernoparla.ejercicioelementales;

import java.util.Scanner;

public class uno_al_N {

    public static void main(String[] args) {
        Scanner entero = new Scanner(System.in);
        int N;
        System.out.println("Introduce un numero entero: ");
        N = entero.nextInt();
        System.out.println("Numeros del 1 al " + N + ": ");
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;
        }
    }

}
