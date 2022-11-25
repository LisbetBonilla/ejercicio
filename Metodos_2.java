package com.tiernoparla.ejercicioelementales;

public class Metodos_2 {

    public static void main(String[] args) {

        //1ºcalcular terminos Fib
        final int HASTA = 10;
        int X1 = 1;
        int X2 = 2;

        int fib_hasta = calculaFibHasta(HASTA, X2, X1);
         //2ºque no pasen de 4M
        //3ºsumar los pares
    }//main

    public static int calculaFibHasta(final int HASTA, int X2, int X1) {
        int tmp = 0;

        for (int i = 3; i <= HASTA; i++) {
            tmp = X2 + X1;
            X1 = X2;
            X2 = tmp;
        }
        return tmp;

       
    }

}
