package com.tiernoparla.ejercicioelementales;


import java.util.Scanner;

public class Tabla_de_multiplicar {

    public static void main(String[] args) {

        int N;
        System.out.println("que numero desea multiplicar : ");
        Scanner numero = new Scanner(System.in);
        N = numero.nextInt();

        int multiplicador;
        for (multiplicador = 1; multiplicador <= 12; multiplicador++) {
            System.out.println(N + "X" + multiplicador + "=" + N * multiplicador);
        }//for
    }//main 
}//public class
