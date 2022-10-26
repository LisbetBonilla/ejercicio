package com.tiernoparla.ejercicioelementales;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        double base, altura, resultado;
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese base:\t");
        base = obj.nextDouble();

        System.out.println("Ingrese altura:\t");
        altura = obj.nextDouble();

        resultado = ((base * altura) / 2);

        System.out.println("El area del Triangulo es:\t" + resultado);
    }//main
}//public class

