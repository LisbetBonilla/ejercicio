package com.tiernoparla.ejercicioelementales;

public class capicula {

    public static void main(String[] arg) {
        //Ver si número es capicúa (usando %10 para sacar las cifras)
        //WHILE

        int N = 1553;

        int tmp = N;
        int cifra;
        int reverso = 0;

        while (tmp > 0) {
            cifra = tmp % 10;
            reverso = reverso * 10 + cifra;
            tmp = tmp / 10;

        } //while    
        System.out.println(reverso);

    }
}
