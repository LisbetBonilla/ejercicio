package com.tiernoparla.ejercicioelementales;

import java.util.Scanner;

public class Pedir_nums_hasta_cero_sumar_muns {

    public static void main(String[] args) {

        Scanner nums = new Scanner(System.in);

        int numero;
        int suma = 0;
        do {
            System.out.println("Dame numeros para sumar: ");
            numero = nums.nextInt();

            suma += numero;
        }while (numero!=0);
        System.out.println(suma);
    }
}
