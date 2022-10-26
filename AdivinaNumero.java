package com.tiernoparla.ejercicioelementales;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        boolean bandera = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero para adivinar");
        int numero = entrada.nextInt();
        while (bandera == false) {
            if (entrada < numero) {
                System.out.println("Ingresa un numero mayor");
                entrada = sc.nextInt();
            }
        }

    } //main
}
