package com.tiernoparla.ejercicioelementales;

public class NumeroPrimo {

    public static boolean isPrime(int p) {

        //boolean is_prime = true;
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }//if
        }//for

        return true;

    } // isPrime       

    public static void main(String[] args) {

        final int p = 23;

        System.out.println(isPrime(p));

    }//main
}//public class
