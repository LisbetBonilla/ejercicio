package com.tiernoparla.ejercicioelementales;

import java.util.Scanner;

public class Hasta_Negativo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int N;
        int contador = 0;
        do {
            System.out.println("Dame un número: ");
            N = teclado.nextInt();
            contador++;
            } while (N > 0);
        if (N < 0) {
            System.out.println("Haz introducido " + contador + " numeros");

        }

    }//main
}//puiblic class
