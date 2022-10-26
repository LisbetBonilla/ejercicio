package com.tiernoparla.ejercicioelementales;

public class PrimosGemelos {

    public static boolean sonGemelos(long a, long b) {
        return esPrimo(a) && esPrimo(b) && Math.abs(a - b) == 2;

    } //boolean sonGemelos

    public static boolean esPrimo(long numero) {
        if (numero <= 1) {
            return false;
        }

        long max = (long) Math.sqrt(numero);
        for (long i = 2; i < max / 2; ++i) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;

    } //boolean esPrimo

    public static boolean isPrime(int p) {
        //boolean is_prime = true;
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }//if
        }//for
        return true;
    } //isPrime

    public static void printPrimosGemelos(int n) {
        for (int i = 2; i < n; i++) {

            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    } //printPrimosGemelos

    public static void main(String[] args) {

        final int N = 100;
        printPrimosGemelos(N);

    } //main
} //public class

