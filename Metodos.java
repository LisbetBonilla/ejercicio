package com.tiernoparla.ejercicioelementales;

public class Metodos {

    public static void main(String[] args) {
        // coger nums hasta cierto nuemro
        final int COTA = 10;
        final int TRES = 3;
        final int CINCO = 5;

        int suma = sumarMultiplos(COTA, TRES, CINCO);
        System.out.println(suma);

    }// main

    public static int sumarMultiplos(final int COTA, final int NUM1,
            final int NUM2) {
        int suma = 0;

        for (int i = 1; i < COTA; i++) {
            if (esMultiploDe(i, NUM1) || esMultiploDe(i, NUM2)) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean esMultiploDe(int num, final int NUMERO) {
        // coger multiplos de 3 o 5
        return num % NUMERO == 0;

    }

}//metodos
