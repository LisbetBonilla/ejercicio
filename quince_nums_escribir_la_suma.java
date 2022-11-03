package com.tiernoparla.ejercicioelementales;

import java.util.Scanner;

public class quince_nums_escribir_la_suma {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int suma = 0;
        int numero;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Introduce los numeros aqui: ");
            numero = num.nextInt();

            suma = suma + numero;
        }
        System.out.println("La suma total es:" + suma);
    }

}
